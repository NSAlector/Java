package world_city_library;

//import Author;
//import Library;

public class LibraryWorkout {
	public static void main(String[] args)
	{
		
		Author auth1 = new Author();
		//System.out.println(auth1);
		
		auth1.setRate(10);
		auth1.setName("Nosova S.A.");
		//System.out.println(auth1);

		Book b1 = new Book("Java Course", auth1,1);
		b1.add_edition();
		b1.add_edition();
		b1.add_edition();
		b1.add_edition();
		b1.add_edition();
		
		System.out.println(b1);
		
		
		Book b2 = new Book("Image Processing Course", auth1,1);
		System.out.println(b2);
		
		Library lib = Library.get_instance();
		lib.add_book(b1);
		lib.add_book(b2);
		
		System.out.println(lib);
		
		lib.get_book(1);
		lib.get_book(1);
		lib.get_book(1);
		
		lib.get_book(0);

		
		System.out.println(lib);
		
		
		Book b3 = new Book("Marchine Learning Course", auth1,1);
		lib.add_book(b3);

		lib.get_book(2);
		lib.get_book(2);
		lib.get_book(2);
		lib.get_book(2);
		lib.get_book(2);
		
		System.out.println(lib);
		
		lib.change_structure();
		
		System.out.println(lib);
		
		}
}
