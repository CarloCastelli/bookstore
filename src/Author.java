public class Author {

  private final String name;
  private final String surname;
  private final String taxCode;

  public Author(String name, String surname, String taxCode) {
    this.name = name;
    this.surname = surname;
    this.taxCode = taxCode;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getTaxCode() {
    return taxCode;
  }

  public boolean equals(Author author) {
    return this.name.equals(author.name) &&
        this.surname.equals(author.surname) &&
        this.taxCode.equals(author.taxCode);
  }

}
