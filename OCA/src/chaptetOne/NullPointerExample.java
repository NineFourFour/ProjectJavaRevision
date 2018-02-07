package chaptetOne;


public class NullPointerExample {

	public static void main(String[] args) {
		
		Book b = new Book();
		System.out.println(b.title); // null (no memory assigned)
		/* If you call a method on a null, you will get a 
		 * NullPointerException */
		System.out.println(b.title.length()); 
	}
}

class Book {
	/* Global/ member variable will get a default value */
	String title;  // null
}
