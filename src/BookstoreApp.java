import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreApp {

  public static void main(String[] args) {

    List<Book> books = generateStockBooks();
    Bookstore bookstore = new Bookstore(books);

    for (Book book : bookstore.getBooks()) {
      System.out.println(book.toString());
    }

    System.out.println("------------------------------");


    Scanner scanner = new Scanner(System.in);

    System.out.print("Choose books name to buy: ");

    String bookName = scanner.nextLine();

    Book chosenBook = bookstore.findByBookName(bookName);
    if (chosenBook == null) {
      System.out.println("Selected book does not exists!");
    } else {
      System.out.print("Select quantity: ");

      String quantity = scanner.nextLine();
      int parsedQuantity = Integer.parseInt(quantity);

      bookstore.sellBook(chosenBook.getIsbn(), parsedQuantity);
    }


  }

  private static List<Book> generateStockBooks() {
    Author nelsonMandela = new Author("Nelson", "Mandela", "1");
    Author jkRowling = new Author("j.k.", "Rowling", "2");
    Author giacomoLeopardi = new Author("Giacomo", "Leopardi", "3");

    Book longWayToFreedom = new Book(
        "1",
        "long way to freedom",
        "una lunga via per la libertà",
        nelsonMandela,
        "biography",
        8,
        10
    );

    Book harryPotter1 = new Book(
        "2",
        "Harry Potter e la pietra filosofale",
        "si gioca a scacchi",
        jkRowling,
        "fantasy",
        2,
        50
    );

    Book lInfinito = new Book(
        "3",
        "l'infinito",
        "poema",
        giacomoLeopardi,
        "noioso",
        4,
        100
    );

    List<Book> books = new ArrayList<>();
    books.add(longWayToFreedom);
    books.add(harryPotter1);
    books.add(lInfinito);
    return books;
  }

}
