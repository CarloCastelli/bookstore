import java.util.ArrayList;
import java.util.List;

public class Bookstore {

  private final List<Book> books;

  public Bookstore(List<Book> books) {
    this.books = books;
  }

  public Book findByBookName(String bookName) {
    for (Book book : this.books) {
      if (book.getName().equals(bookName)) {
        return book;
      }
    }
    return null;
  }

  public Book findByIsbn(String isbn) {
    for (Book book : this.books) {
      if (book.getIsbn().equals(isbn)) {
        return book;
      }
    }
    return null;
  }

  public List<Book> findByAuthor(Author author) {
    List<Book> authorBooks = new ArrayList<>();
    for (Book book : this.books) {
      if (book.getAuthor().equals(author)) {
        authorBooks.add(book);
      }
    }
    return authorBooks;
  }

  public List<Book> findByGenre(String genre) {
    List<Book> authorBooks = new ArrayList<>();
    for (Book book : this.books) {
      if (book.getGenre().equals(genre)) {
        authorBooks.add(book);
      }
    }
    return authorBooks;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void remove(Book book) {
    books.remove(book);
  }

  public void updatePrice(String isbn, int price) {
    Book book = findByIsbn(isbn);
    if (book != null) {
      book.setPrice(price);
    }
  }

  public List<Book> getBooks() {
    return books;
  }

  public void sellBook(String isbn, int quantity) {
    Book book = findByIsbn(isbn);
    if (book != null && book.getStock() >= quantity) {
      book.setStock(book.getStock() - quantity);
    }
  }
}
