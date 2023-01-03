package board.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dao.BoardDao;
import board.dao.BoardDaoImpl;
import vo.BoardVO;
import vo.PageVO;

public class BoardServiceImpl implements BoardService {
	private static BoardService instance = null;
	private BoardDao dao = null;

	private BoardServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardServiceImpl();
		return instance;
	}

	@Override
	public int insertBoard(BoardVO boardVo) throws SQLException {
		return dao.insertBoard(boardVo);
	}

	@Override
	public int deleteBoard(int boardVo) throws SQLException {
		return dao.deleteBoard(boardVo);
	}

	@Override
	public int updateBoard(BoardVO boardVo) throws SQLException {
		return dao.updateBoard(boardVo);
	}

	@Override
	public List<BoardVO> getAllBoardList(int board_category_no) throws SQLException {
		return dao.getAllBoardList(board_category_no);
	}

	@Override
	public BoardVO getBoard(int boardNo) throws SQLException {
		return dao.getBoard(boardNo);
	}

	@Override
	public int setCountIncrement(int boardNo) throws SQLException {
		return dao.setCountIncrement(boardNo);
	}

}
