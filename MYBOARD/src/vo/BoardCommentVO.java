package vo;

public class BoardCommentVO {
	private int board_comment_no;
	private String board_comment_content;
	private String board_comment_date;
	private int mem_no;
	private String mem_name;
	private int board_no;
	
	public BoardCommentVO() { }

	public BoardCommentVO(int board_comment_no, String board_comment_content, String board_comment_date, int mem_no, String mem_name, int board_no) {
		this.board_comment_no = board_comment_no;
		this.board_comment_content = board_comment_content;
		this.board_comment_date = board_comment_date;
		this.mem_no = mem_no;
		this.mem_name = mem_name;
		this.board_no = board_no;
	}

	public int getBoard_comment_no() {
		return board_comment_no;
	}

	public void setBoard_comment_no(int board_comment_no) {
		this.board_comment_no = board_comment_no;
	}

	public String getBoard_comment_content() {
		return board_comment_content;
	}

	public void setBoard_comment_content(String board_comment_content) {
		this.board_comment_content = board_comment_content;
	}

	public String getBoard_comment_date() {
		return board_comment_date;
	}

	public void setBoard_comment_date(String board_comment_date) {
		this.board_comment_date = board_comment_date;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	@Override
	public String toString() {
		return "BoardCommentVO [board_comment_no=" + board_comment_no + ", board_comment_content="
				+ board_comment_content + ", board_comment_date=" + board_comment_date + ", mem_no=" + mem_no
				+ ", mem_name=" + mem_name + ", board_no=" + board_no + "]";
	}
	
}
