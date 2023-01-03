package kr.or.ddit.notice.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.notice.dao.NoticeDAOImpl;
import kr.or.ddit.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService {
	private static NoticeServiceImpl instance = null;
	private NoticeDAOImpl dao = null;

	private NoticeServiceImpl() {
		dao = NoticeDAOImpl.getInstance();
	}

	public static NoticeServiceImpl getInstance() {
		if (instance == null)
			instance = new NoticeServiceImpl();
		return instance;
	}

	@Override
	public void create(NoticeVO notice) throws SQLException {
		dao.create(notice);
	}

	@Override
	public List<NoticeVO> list() throws SQLException {
		return dao.list();
	}

	@Override
	public NoticeVO read(int boNo) throws SQLException {
		return dao.read(boNo);
	}

	@Override
	public void delete(int boNo) throws SQLException {
		dao.delete(boNo);
	}

	@Override
	public void modify(NoticeVO vo) throws SQLException {
		dao.modify(vo);
	}
}
