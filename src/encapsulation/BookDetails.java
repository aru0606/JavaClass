package encapsulation;

public class BookDetails extends LibraryBook {
	public static void main(String[] args) {

		LibraryBook book = new LibraryBook();

		book.setBookId(101);
		System.out.println("Book Id:" + book.getBookId());
		book.setTitle("Java Programming");
		System.out.println("Title:" + book.getTitle());

		book.issueBook();
		book.issueBook();
	
		book.returnBook();
		book.issueBook();
		
		book.isAvailable();
	}
}
