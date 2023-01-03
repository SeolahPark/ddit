package board.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

import board.service.BoardService;
import board.service.IBoardService;
import files.controller.FileController;
import files.service.FilesService;
import files.service.IFilesService;
import vo.BoardCommentVO;
import vo.BoardVO;
import vo.PageVO;

@MultipartConfig()
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBoardService service = BoardService.getInstance();
	private IFilesService fileService = FilesService.getInstance();
			
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		List<BoardVO> boardList = new ArrayList<BoardVO>();

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		if(command.equals("/board/List.do")) {
			try {
				getAllBoardList(request, response);
			} catch (ServletException | IOException e) {
				System.out.println("GET List.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Read.do")) {
			try {
				boardRead(request, response);
			} catch (ServletException | IOException | SQLException e) {
				System.out.println("GET Read.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Update.do")) {
			try {
				boardUpdateGet(request, response);
			} catch (ServletException | IOException e) {
				System.out.println("GET Update.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Delete.do")) {
			try {
				boardDelete(request, response);
			} catch (IOException e) {
				System.out.println("GET Delete.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Insert.do")) {
			try {
				request.getRequestDispatcher("/pages/board/boardInsert.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				System.out.println("GET Insert.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/deleteComment.do")) {
			try {
				deleteComment(request,response);
			} catch (IOException e) {
				System.out.println("GET deleteComment.do 오류");
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		List<BoardVO> boardList = new ArrayList<BoardVO>();

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		if(command.equals("/board/Insert.do")) {
			try {
				insertBoard(request, response);
			} catch (ServletException | IOException e) {
				System.out.println("POST Insert.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Update.do")) {
			try {
				boardUpdatePost(request, response);
			} catch (IOException | ServletException e) {
				System.out.println("POST Update.do 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/insertComment.do")) {
			try {
				insertComment(request, response);
			} catch (IOException e) {
				System.out.println("POST commentInsert.do 오류");
				e.printStackTrace();
			}
		}
	}
	
	
	// 게시판 댓글 삭제하기
	private void deleteComment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int board_comment_no = Integer.parseInt(request.getParameter("board_comment_no"));
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		
		service.deleteComment(board_comment_no);
		response.sendRedirect(request.getContextPath() + "/board/Read.do?board_no="+board_no);
	}
	
	// 게시판 댓글 등록하기
	private void insertComment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		String board_comment_content = request.getParameter("board_comment_content");
		
		BoardCommentVO vo = new BoardCommentVO();
		vo.setMem_no(mem_no);
		vo.setBoard_no(board_no);
		vo.setBoard_comment_content(board_comment_content);

		service.insertComment(vo);
		
		response.sendRedirect(request.getContextPath() + "/board/Read.do?board_no="+vo.getBoard_no());
	}

	// 게시판 글 등록하기
	private void insertBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		BoardVO vo = new BoardVO();
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			System.out.println("post insert BeanUtils 오류");
			e.printStackTrace();
		} 
		
		int boardNum = service.insertBoard(vo);
		
//		String path = "C:/Users/seolah/Documents/Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MYBOARD/img/board";
//		ServletContext app = getServletContext();
//		int maxSize = 5*1024*1024;
//
//		MultipartRequest multi = FileController.insertFiles(request, path, maxSize);
//		if(multi==null) {
//			System.out.println("업로드 실패");
//		}
		
		response.sendRedirect(request.getContextPath() + "/board/List.do?page=1");
	}

	// 게시판 글 삭제하기
	private void boardDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		
		service.deleteBoard(boardNo);
		
		response.sendRedirect(request.getContextPath() + "/board/List.do?page=1");
	}
	
	// 게시판 글 수정하기
	private void boardUpdatePost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		BoardVO vo = new BoardVO();
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			System.out.println("post update BeanUtils 오류");
			e.printStackTrace();
		} 
		service.updateBoard(vo);
		
//		만약 파일이 있으면 파일쪽으로, 없으면 list로
		if(request.getParameter("files") != null) {
			request.getRequestDispatcher("/files/updateFiles.do?board_no="+vo.getBoard_no()).forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + "/board/List.do?page=1");
		}
	}


	private void boardUpdateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		BoardVO vo = service.getBoard(boardNo);
		request.setAttribute("boardInfo", vo);
		request.getRequestDispatcher("/pages/board/boardUpdate.jsp").forward(request, response);
		
	}
	
	// 게시판 글 상세보기
	private void boardRead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		Map<String, Object>  map = new HashMap<String, Object>();
		
		map.put("col", "BOARD_NO");
		map.put("no", boardNo);
		
		List<BoardCommentVO> boardCommentList = readComment(request, response);
		service.setCountIncrement(boardNo);
		BoardVO boardVo = service.getBoard(boardNo);
		boardVo.setBoard_content(boardVo.getBoard_content().replaceAll("\n", "<br/>"));

		//파일의 모든정보
		int check = -1;
		try {
			check = fileService.searchFile(map);
		} catch (SQLException e) {
			System.out.println("boardRead searchFile 오류");
			e.printStackTrace();
		}
		
		request.setAttribute("boardInfo", boardVo);
		request.setAttribute("boardCommentList", boardCommentList);
		request.setAttribute("filecheck", check);
		
		request.getRequestDispatcher("/pages/board/boardInfo.jsp").forward(request, response);
	}
	
	// 댓글 전체 리스트
	private List<BoardCommentVO> readComment(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		List<BoardCommentVO> list = service.selectComment(boardNo);

		return list;
	}
	
	// 게시판 글 목록보기
	private void getAllBoardList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));
		String stype = request.getParameter("stype");
		String sword = request.getParameter("sword");
		
		PageVO pvo = service.pageInfo(page, stype, sword);
		
		Map<String, Object>  map = new HashMap<String, Object>();
		map.put("start", pvo.getStart());
		map.put("end", pvo.getEnd());
		map.put("stype", stype);
		map.put("sword", sword);
		
		List<BoardVO> boardList = service.getAllBoardList(map);
		
		request.setAttribute("boardList", boardList);
		request.setAttribute("startpage", pvo.getStartPage());
		request.setAttribute("endpage", pvo.getEndPage());
		request.setAttribute("totalpage", pvo.getTotalPage());
		
		request.getRequestDispatcher("/pages/board/board.jsp").forward(request, response);
	}

}
