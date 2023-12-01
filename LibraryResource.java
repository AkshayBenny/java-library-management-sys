import java.util.ArrayList;
import java.util.UUID;

class LibraryResource {
  protected String title;
  private String description;
  protected Author author;
  private boolean isAvailable; // connect to library class
  protected String genre;
  private String resourceId;
  private String isbn;
  private int numPages;
  private String publisher;
  private String publishedYear;
  private String language;
  private ArrayList<String> checkedOutBy = new ArrayList<>();
  private Object borrowedBy = null; // connect this to the library class

  // Initialise
  public LibraryResource(String title, Author author, String genre) {
    this.resourceId = UUID.randomUUID().toString();
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.borrowedBy = null;
  }

  // Accessors
  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public Author getAuthor() {
    return author;
  }

  public boolean getIsAvailable() {
    return this.isAvailable;
  }

  public String getGenre() {
    return genre;
  }

  public String getResourceId() {
    return resourceId;
  }

  public String getIsbn() {
    return isbn;
  }

  public int getNumPages() {
    return numPages;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getPublishedYear() {
    return publishedYear;
  }

  public String getLanguage() {
    return language;
  }

  public ArrayList<String> getCheckedOutBy() {
    return new ArrayList<>(checkedOutBy);
  }

  public Object getBorrowedBy() {
    return borrowedBy;
  }

  public void printBorrowedByDetails() {
    if (borrowedBy instanceof Member) {
      Member member = (Member) borrowedBy;
      System.out.println("This book was borrowed by a member. Details of the member are given below:");
      member.getMemberDetails();
    } else if (borrowedBy instanceof Guest) {
      Guest guest = (Guest) borrowedBy;
      System.out.printf("This resource was used by a guest %s", guest.getFullName());
    }
  }

  public void getDetails() {
    System.out.printf("The name of the book is %s\n", this.title);
    System.out.printf("%s is the author for this book\n", this.author);
    System.out.printf("It belongs to the genre %s\n", this.genre);
  }

  // Mutators
  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setPublishedYear(String publishedYear) {
    this.publishedYear = publishedYear;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setBorrowedBy(Object person) {
    this.borrowedBy = person;
  }

  public void addCheckedOutBy(String person) {
    this.checkedOutBy.add(person);
  }

  public void removeCheckedOutBy(String person) {
    this.checkedOutBy.remove(person);
  }
}
