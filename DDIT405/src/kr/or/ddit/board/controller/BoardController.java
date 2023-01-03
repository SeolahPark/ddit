package board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.service.BoardService;
import board_comment.service.BoardCommentSerciveImpl;
import board_comment.service.BoardCommentService;
import kr.or.ddit.board.service.BoardServiceImpl;
import vo.BoardCommentVO;
import vo.BoardVO;

public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardService service = BoardServiceImpl.getInstance();
	private BoardCommentService commentBoardService = BoardCommentSerciveImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 내가 요청한 모든 Method 'get'방식의 URL을 다 받는다.
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		// command로 남는 값은 /board/list.do, /board/read.do 와 같은 URL이다.
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		if(command.equals("/board/setSession.do")) {
			try {
				setSession(request, response);
			} catch (Exception e) {
				System.out.println("get setSession 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/List.do")) {
			try {
				getBoardList(request, response);
			} catch (Exception e) {
				System.out.println("get boardList 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Read.do")) {
			try {
				boardRead(request, response);
			} catch (NumberFormatException | SQLException e) {
				System.out.println("boardRead 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Update.do")) {
				request.getRequestDispatcher("/WEB-INF/view/board/boardUpdate.jsp").forward(request, response);
		}else if(command.equals("/board/Delete.do")) {
			try {
				boardDelete(request, response);
			} catch (NumberFormatException | SQLException e) {
				System.out.println("boardDelete 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/Insert.do")) {
				insertjsp(request, response);
		}else if(command.equals("/board/InsertComment.do")) {
			try {
				commentInsert(request, response);
			} catch (Exception e) {
				System.out.println("commentInsert 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/ReadComment.do")) {
			try {
				commentRead(request, response);
			} catch (Exception e) {
				System.out.println("commentRead 오류");
				e.printStackTrace();
			}
		}else if(command.equals("/board/ReplyDelete.do")) {
			try {
				replyDelete(request,response);
			} catch (Exception e) {
				System.out.println("ReplyDelete 오류");
				e.printStackTrace();
			}
		}
	}
	
	// 게시판 댓글 삭제
	private void replyDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, NumberFormatException, SQLException {
		
		String commentNo = request.getParameter("reNo");

		int result = commentBoardService.deleteComment(Integer.parseInt(commentNo));
		
		PrintWriter out = response.getWriter();
		out.write(result + "");    // JSON데이터를 응답으로 보내준다.
		response.flushBuffer();
//		response.sendRedirect(request.getContextPath() + "/board/List.do");
	}

	private void setSession(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int boardCategoryNo = Integer.parseInt(request.getParameter("boardCategoryNo"));
		HttpSession session = request.getSession();
		session.setAttribute("boardCategoryNo", boardCategoryNo);
		request.getRequestDispatcher("/board/List.do").forward(request, response);
	}

	private void insertjsp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/view/board/boardInsert.jsp").forward(request, response);
	}

	// 댓글 전체 리스트
	private List<BoardCommentVO> commentRead(HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		List<BoardCommentVO> boardCommentList = commentBoardService.selectComment(boardNo);

		return boardCommentList;
	}

	// 게시판 댓글 추가
	private void commentInsert(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		BoardCommentVO boardCommentVO = new BoardCommentVO();

		String content = request.getParameter("content");
		String boardNo = request.getParameter("boardVo");
		String memNo = request.getParameter("memNo");

		boardCommentVO.setBoard_comment_content(content);
		boardCommentVO.setBoard_no(Integer.parseInt(boardNo));
		boardCommentVO.setMem_no(Integer.parseInt(memNo));

		commentBoardService.insertComment(boardCommentVO);
		response.sendRedirect(request.getContextPath() + "/board/Read.do?board_no=" + boardNo);
	}

	// 게시판 글 상세
	private void boardRead(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("board_no"));
		List<BoardCommentVO> boardCommentList = commentRead(request, response);
		service.setCountIncrement(boardNo);
		BoardVO boardVo = service.getBoard(boardNo);

		request.setAttribute("boardInfo", boardVo);
		request.setAttribute("boardCommentList", boardCommentList);

		request.getRequestDispatcher("/WEB-INF/view/board/boardInfo.jsp").forward(request, response);
	}

	// 게시판 글 목록
	private void getBoardList(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		HttpSession session = request.getSession();
		int boardCategoryNo = (int) session.getAttribute("boardCategoryNo");
		session.setAttribute("boardCategoryNo", boardCategoryNo); // 게시판 카테고리 번호 세션에 저장

		BoardService service = BoardServiceImpl.getInstance();
		List<BoardVO> list = service.getAllBoardList(boardCategoryNo);

		System.out.println("getBoardList boardcategoryno: " + boardCategoryNo);

		request.setAttribute("boardList", list);
		request.setAttribute("category", boardCategoryNo);
		// view jsp페이지로 이동
		request.getRequestDispatcher("/WEB-INF/view/board/board.jsp").forward(request, response);
	}

	// 게시판 글 삭제
	private void boardDelete(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String boardNo = request.getParameter("boardVo");
		int boardCategoryNo = Integer.parseInt(request.getParameter("boardCategoryNo"));

		int boardVo = service.deleteBoard(Integer.parseInt(boardNo));
		response.sendRedirect(request.getContextPath() + "/board/List.do?boardCategoryNo=" + boardCategoryNo);
	}

//////////////////////////////// post방식////////////////////////////////////////

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 내가 요청한 모든 Method 'get'방식의 URL을 다 받는다.
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		// command로 남는 값은 /board/list.do, /board/read.do 와 같은 URL이다.

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		List<BoardVO> boardList = new ArrayList<BoardVO>();

		if (command.equals("/board/Update.do")) {
			try {
				boardUpdatePost(request, response);
			} catch (NumberFormatException | SQLException e) {
				System.out.println("boardUpdatePost 오류");
				e.printStackTrace();
			}
		} else if (command.equals("/board/Insert.do")) {
			try {
				insertBoardPost(request, response);
			} catch (NumberFormatException | SQLException e) {
				System.out.println("insertBoardPost 오류");
				e.printStackTrace();
			}
		} else if (command.equals("/board/List.do")) {
			try {

			} catch (Exception e) {
				System.out.println("post boardList 오류");
				e.printStackTrace();
			}
		}

	}

	// 게시판 글 수정
	private void boardUpdatePost(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		BoardVO boardVo = new BoardVO();

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int boardNo = Integer.parseInt(request.getParameter("boardVo"));
		int memNo = Integer.parseInt(request.getParameter("mem_no"));

		boardVo.setBoard_no(boardNo);
		boardVo.setBoard_title(title);
		boardVo.setBoard_content(content);
		boardVo.setMem_no(memNo);

		int res = service.updateBoard(boardVo);
		response.sendRedirect(request.getContextPath() + "/board/List.do");
	}

	// 게시판 글 추가
	private void insertBoardPost(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		BoardVO boardVo = new BoardVO();
		HttpSession session = request.getSession();
		int boardCategoryNo = (int) session.getAttribute("boardCategoryNo");

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int memNo = Integer.parseInt(request.getParameter("mem_no"));

		String boardDate = request.getParameter("board_date");
		int boardHit = Integer.parseInt(request.getParameter("board_hit"));

		System.out.println("insertBoardPost : " + boardCategoryNo);

		boardVo.setBoard_title(title);
		boardVo.setBoard_content(content);
		boardVo.setMem_no(memNo);
		boardVo.setBoard_category_no(boardCategoryNo);
		boardVo.setBoard_date(boardDate);
		boardVo.setBoard_hit(boardHit);

		service.insertBoard(boardVo);

		response.sendRedirect(request.getContextPath() + "/board/List.do");
	}

}




