package java10_collection.practice2;

public class Book {
	
	private String bNol;	//도서번호 
	private int category;	//도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	private String title;	//책제목
	private String author;	//저자
	
	// 생성자
	public Book(String bNol,int category, String title, String author ) {
		setbNol(bNol);
		setCategory(category);
		setTitle(title);
		setAuthor(author);	
	}
	

	// get set
	public String getbNol() {
		return bNol;
	}

	public void setbNol(String bNol) {
		this.bNol = bNol;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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


	@Override
	public String toString() {
		return "Book [bNol=" + bNol + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
}
