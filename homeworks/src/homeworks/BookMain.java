package homeworks;

public class BookMain {
	public static void main(String[] args) {
		Book Book1 = new Book();
		Book1.id = 11;
		Book1.name = "Chess";
		Book1.pageCount = 90;
		Book1.description = "classic";
		System.out.println("Book1.id: " + Book1.id);
		System.out.println("Book1.name: " + Book1.name);
		System.out.println("Book1.pageCount: " + Book1.pageCount);
		System.out.println("Book1.description: " + Book1.description);

		System.out.println();

		Book Book2 = new Book();
		Book2.id = 15;
		Book2.name = "Fear";
		Book2.pageCount = 100;
		Book2.description = "classic";
		System.out.println("Book2.id: " + Book2.id);
		System.out.println("Book2.name: " + Book2.name);
		System.out.println("Book2.pageCount: " + Book2.pageCount);
		System.out.println("Book2.description: " + Book2.description);

	}

}
