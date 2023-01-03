package kr.or.ddit.notice.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.notice.service.INoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.vo.NoticeVO;

public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private INoticeService service = NoticeServiceImpl.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String goPage = "";
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");

		System.out.println(command + " 페이지를 요청합니다!");
		if (command.equals("/notice/list.do")) {
			List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
			try {
				noticeList = list();
				req.setAttribute("noticeList", noticeList);
			} catch (Exception e) {
				System.out.println("get list 오류");
				e.printStackTrace();
			}
			goPage = "list.jsp";
		} else if (command.equals("/notice/read.do")) {
			String boNo = req.getParameter("boNo");
			NoticeVO vo;
			try {
				vo = read(Integer.parseInt(boNo));
				req.setAttribute("notice", vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			goPage = "detail.jsp";
		} else if (command.equals("/notice/form.do")) {
			goPage = "form.jsp";
		} else if (command.equals("/notice/modify.do")) {
			String boNo = req.getParameter("boNo");
			NoticeVO vo;
			try {
				vo = read(Integer.parseInt(boNo));
				req.setAttribute("notice", vo);
				req.setAttribute("status", "u");
			} catch (Exception e) {
				e.printStackTrace();
			}
			goPage = "form.jsp";
		}
		req.getRequestDispatcher("/WEB-INF/views/notice/" + goPage).forward(req, resp);
	}

	private NoticeVO read(int boNo) throws Exception {
		return service.read(boNo);
	}

	private List<NoticeVO> list() throws Exception {
		List<NoticeVO> list = service.list();
		if (list == null || list.size() == 0) {
			return null;
		}
		return list;
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");

		System.out.println(command + " 페이지를 요청합니다!");

		if (command.equals("/notice/register.do")) {
			try {
				register(req, resp);
			} catch (Exception e) {
				System.out.println("post register 오류");
				e.printStackTrace();
			}
		} else if (command.equals("/notice/modify.do")) {
			NoticeVO vo = new NoticeVO();
			try {
				BeanUtils.populate(vo, req.getParameterMap());
				modify(vo, req, resp);
			} catch (NumberFormatException | SQLException | IOException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} else if (command.equals("/notice/delete.do")) {
			String boNo = req.getParameter("boNo");
			try {
				delete(Integer.parseInt(boNo), req, resp);
			} catch (NumberFormatException | SQLException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void modify(NoticeVO vo, HttpServletRequest req, HttpServletResponse resp)
			throws SQLException, IOException {
		service.modify(vo);
		req.setAttribute("msg", "수정 완료되었습니다");
		resp.sendRedirect("/notice/list.do");
	}

	private void delete(int boNo, HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		service.delete(boNo);
		req.setAttribute("msg", "삭제가 완료되었습니다");
		resp.sendRedirect("/notice/list.do");
	}

	private void register(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		NoticeVO notice = new NoticeVO();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setWriter("박설아");

		service.create(notice);

		// 실시간 알림
		TelegramMessageController tmc = new TelegramMessageController();
		tmc.sendGet(title);

		req.setAttribute("msg", "등록이 완료되었습니다.");
		resp.sendRedirect("/notice/list.do");
	}

}