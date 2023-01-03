package kr.or.ddit.notice.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.vo.NoticeVO;

public interface INoticeService {

	public void create(NoticeVO notice) throws SQLException;

	public List<NoticeVO> list() throws SQLException;

	public NoticeVO read(int boNo) throws SQLException;

	public void delete(int boNo) throws SQLException;

	public void modify(NoticeVO vo) throws SQLException;

}
