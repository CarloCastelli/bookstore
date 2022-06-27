public class Book {

  private final String isbn;
  private final String name;
  private final String description;
  private final Author author;
  private final String genre;

  private int price;
  private int stock;

  public Book(String isbn, String name, String description, Author author, String genre, int price,
      int stock) {
    this.isbn = isbn;
    this.name = name;
    this.description = description;
    this.author = author;
    this.genre = genre;
    this.price = price;
    this.stock = stock;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Author getAuthor() {
    return author;
  }

  public String getGenre() {
    return genre;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("[name: %s, description: %s, isbn: %s]", this.name, this.description,
        this.isbn);
  }

  public boolean equals(Book book) {
    return this.name.equals(book.getName()) && this.isbn.equals(book.getIsbn());
  }
}
