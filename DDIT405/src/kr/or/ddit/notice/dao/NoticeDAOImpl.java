package kr.or.ddit.notice.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapClientFactory;
import kr.or.ddit.vo.NoticeVO;

public class NoticeDAOImpl implements INoticeDAO {
	private SqlMapClient smc = null;
	private static NoticeDAOImpl instance = null;

	private NoticeDAOImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	public static NoticeDAOImpl getInstance() {
		if (instance == null)
			instance = new NoticeDAOImpl();
		return instance;
	}

	@Override
	public void create(NoticeVO notice) throws SQLException {
		smc.insert("notice.create", notice);
	}

	@Override
	public List<NoticeVO> list() throws SQLException {
		return smc.queryForList("notice.list");
	}

	@Override
	public NoticeVO read(int boNo) throws SQLException {
		return (NoticeVO) smc.queryForObject("notice.read", boNo);
	}

	@Override
	public void delete(int boNo) throws SQLException {
		smc.delete("notice.delete", boNo);
	}

	@Override
	public void modify(NoticeVO vo) throws SQLException {
		smc.update("notice.modify", vo);
	}
}
