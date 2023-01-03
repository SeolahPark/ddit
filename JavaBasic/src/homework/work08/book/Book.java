package homework.work08.book;

public abstract class Book /* extends Object */ {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract int getLateFee(int lateDays);

	public boolean equals(Object obj) {
		String title = ((Book) obj).getTitle();
		String author = ((Book) obj).getAuthor();
		if (title.equals(this.title) && author.equals(this.author)) {
			return true;
		} else
			return false;
//		if (o instanceof Book) {
//			Book book = (Book) o;
//			return title.equals(book.title);
//		} else
//			return false;
	}

	public int hashCode() { // 객체를 숫자로 변환해서 보여줌.
		return super.hashCode();
	}

	@Override
	public String toString() {
		return String.format("관리번호 %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)", this.number, this.title, this.author,
				getLateFee(7));
	}

}
