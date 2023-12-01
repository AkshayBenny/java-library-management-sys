import java.util.ArrayList;
import java.util.UUID;

/**
 * Represents a library resource both physical and electornic.
 * This class servers as a base for PhysicalResource and ElectronicResource
 * classes.
 *
 * @author Akshay
 * @version 1.0
 */
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

  /**
   * Constructor for object of class LibraryResource
   * 
   * @param title  Title of resource
   * @param author Author of resource
   * @param genre  Genre of resource
   */
  public LibraryResource(String title, Author author, String genre) {
    this.resourceId = UUID.randomUUID().toString();
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.borrowedBy = null;
  }

  /**
   * An accessor to get the title of the resource.
   *
   * @return string title
   */
  public String getTitle() {
    return title;
  }

  /**
   * An accessor to get the description of the resource.
   *
   * @return string description of the resource
   */
  public String getDescription() {
    return description;
  }

  /**
   * An accessor to get the author object related to the resource.
   *
   * @return author object related to the resource
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * An accessor to get if this resource is available or not.
   *
   * @return boolean returns if resource is available or not
   */
  public boolean getIsAvailable() {
    return this.isAvailable;
  }

  /**
   * An accessor to get the genre of the resource.
   *
   * @return string genre
   */
  public String getGenre() {
    return genre;
  }

  /**
   * An accessor to get the resource id.
   *
   * @return string resource id
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * An accessor to get the isbn number.
   *
   * @return string ISBN number
   */
  public String getIsbn() {
    return isbn;
  }

  /**
   * An accessor to get the number of pages.
   *
   * @return string number of pages
   */
  public int getNumPages() {
    return numPages;
  }

  /**
   * An accessor to get the name of the publisher.
   *
   * @return string publisher name
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * An accessor to get the year of publication.
   *
   * @return string publication year
   */
  public String getPublishedYear() {
    return publishedYear;
  }

  /**
   * An accessor to get the language of this resource.
   *
   * @return string resource language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * An accessor to get list members who checked out this resource.
   *
   * @return list of members
   */
  public ArrayList<String> getCheckedOutBy() {
    return new ArrayList<>(checkedOutBy);
  }

  /**
   * An accessor to get object of member who borrowed this resource.
   *
   * @return object of member
   */
  public Object getBorrowedBy() {
    return borrowedBy;
  }

  /**
   * An accessor to print details about the member who borrowed this resource.
   */
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

  /**
   * An accessor to print details about this resource.
   */
  public void getDetails() {
    System.out.printf("The name of the book is %s\n", this.title);
    System.out.printf("%s is the author for this book\n", this.author);
    System.out.printf("It belongs to the genre %s\n", this.genre);
  }

  /**
   * A mutator to set the title of this resource
   *
   * @param title new title to be set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A mutator to set the description of this resource
   *
   * @param description new description to be set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A mutator to set the author of this resource
   *
   * @param author new author to be set
   */
  public void setAuthor(Author author) {
    this.author = author;
  }

  /**
   * A mutator to set the availability of this resource
   *
   * @param isAvailable new availability to be set
   */
  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  /**
   * A mutator to set the genre of this resource
   *
   * @param genre new genre to be set
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * A mutator to set the isbn number of this resource
   *
   * @param isbn new isbn number to be set
   */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   * A mutator to set the number of pages for this resource
   *
   * @param numPages new page number to be set
   */
  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  /**
   * A mutator to set the publisher of this resource
   *
   * @param publisher new publisher to be set
   */
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /**
   * A mutator to set the published year of this resource
   *
   * @param publishedYear new published year to be set
   */
  public void setPublishedYear(String publishedYear) {
    this.publishedYear = publishedYear;
  }

  /**
   * A mutator to set the language of this resource
   *
   * @param language new language to be set
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * A mutator to set object of the person who borrowed this resource
   *
   * @param person new person object to be set
   */
  public void setBorrowedBy(Object person) {
    this.borrowedBy = person;
  }

  /**
   * A mutator to set who checked this resource out
   *
   * @param person object of person who checked out this resource
   */
  public void addCheckedOutBy(String person) {
    this.checkedOutBy.add(person);
  }

  /**
   * A mutator to remove the person who checked out this resource
   *
   * @param person object of person who checked out this resource to be removed
   */
  public void removeCheckedOutBy(String person) {
    this.checkedOutBy.remove(person);
  }
}
