package gof.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("Webを支える技術"));
		bookShelf.appendBook(new Book("パーフェクトJava"));
		bookShelf.appendBook(new Book("基礎からのサーブレット/JSP"));
		bookShelf.appendBook(new Book("Effective Java"));

		Iterator<Book> bitr = bookShelf.iterator();
		while (bitr.hasNext()) {
			Book b = bitr.next();
			System.out.println(b.getName());
		}

	}

}
