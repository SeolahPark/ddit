package kr.or.ddit.jdbc;

public class NoticeVO {
	// DB Notice 테이블을 보고 필드, G, S 구현하세요
	int bo_num;
	String bo_title;
	String bo_content;
	String bo_write;
	String bo_date;
	int bo_hit;

	public int getBo_num() {
		return bo_num;
	}

	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}

	public String getBo_title() {
		return bo_title;
	}

	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}

	public String getBo_content() {
		return bo_content;
	}

	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}

	public String getBo_write() {
		return bo_write;
	}

	public void setBo_write(String bo_write) {
		this.bo_write = bo_write;
	}

	public String getBo_date() {
		return bo_date;
	}

	public void setBo_date(String bo_date) {
		this.bo_date = bo_date;
	}

	public int getBo_hit() {
		return bo_hit;
	}

	public void setBo_hit(int bo_git) {
		this.bo_hit = bo_git;
	}

}
