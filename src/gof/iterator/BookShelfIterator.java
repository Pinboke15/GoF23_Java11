package gof.iterator;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return (index < bookShelf.getLength());
	}

	@Override
	public Book next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
