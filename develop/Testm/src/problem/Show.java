package problem;

public class Show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[2];
		
		bookList(books);
		System.out.println(books[0].getName());
		System.out.println(books[1].getName());
		
		

	}
	
	public static void bookList(Book[] book) {
		book[0]=new Book(1, "사회");
		book[1]=new Book(2, "과학");
		

	}

}
