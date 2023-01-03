package board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import vo.BoardCommentVO;
import vo.BoardVO;
import vo.PageVO;

public interface IBoardDAO {

	public List<BoardVO> getAllBoardList(Map<String, Object> map);
	
	public int getTotalCount(Map<String, Object> map);
	
	public BoardVO getBoard(int boardNo);

	public void setCountIncrement(int boardNo);

	public int insertBoard(BoardVO vo);

	public void deleteBoard(int boardNo);

	public void updateBoard(BoardVO vo);

	public void insertComment(BoardCommentVO vo);

	public List<BoardCommentVO> selectComment(int boardNo);

	public void deleteComment(int board_comment_no);
}
