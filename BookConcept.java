public class BookConcept{

	private String title;
	private String author;
	private String isbn;
	private int yearOfPublishing;
	private static int amountOfBooks = 0;
	private static String publisher = "Vanier";

	public BookConcept(String title, String author, String isbn, int yearOfPublishing){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.yearOfPublishing = yearOfPublishing;
	}

	//accesors
	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public String getisbn(){
		return isbn;
	}

	public int getyearOfPublishing(){
		return yearOfPublishing;
	}

	public String getamountOfBooks(){
		return amountOfBooks;
	}

	public String getpublisher(){
		return publisher;
	}

	//mutators
	public void incrementBook(){
		amountOfBooks++;
	}

	//equals
	public boolean sameISBN(BookConcept other){
		return (isbn.equals(other.isbn));
	}

	public boolean samePublisher(BookConcept other){
		return (publisher.equals(other.publisher));
	}

	public boolean sameAmountOfBooks(BookConcept other){
		return (amountOfBooks.equals(other.amountOfBooks));
	}

	//tostring
	public String tostring(){
		return "Title              : " + title +
			   "Author             : " + author +
			   "ISBN               : " + isbn +
			   "Year of publishing : " + yearOfPublishing +
			   "Publisher          : " + publisher 
	}

}