package board.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapClientFactory;
import vo.BoardVO;

public class BoardDaoImpl implements BoardDao {
	private static BoardDao instance = null;
	private SqlMapClient smc = null;

	private BoardDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	public static BoardDao getInstance() {
		if (instance == null)
			instance = new BoardDaoImpl();
		return instance;
	}

	@Override
	public int insertBoard(BoardVO boardVo) throws SQLException {
		int cnt = 0;
		Object obj = smc.insert("board.insertBoard",boardVo);
		if(obj==null) cnt =1;
		return cnt;
	}

	@Override
	public int deleteBoard(int boardVo) throws SQLException {
		return smc.delete("board.deleteBoard",boardVo);
	}

	@Override
	public int updateBoard(BoardVO boardVo) throws SQLException {
		return smc.update("board.updateBoard",boardVo);
	}
	
	@Override
	public BoardVO getBoard(int boardNo) throws SQLException {
		return (BoardVO) smc.queryForObject("board.getBoard",boardNo);
	}

	@Override
	public int setCountIncrement(int boardNo) throws SQLException {
		return smc.update("board.setCountIncrement",boardNo);
	}

	@Override
	public List<BoardVO> getAllBoardList(int board_category_no) throws SQLException {
		return smc.queryForList("board.getAllBoardList",board_category_no);
	}

}
