import java.util.ArrayList;
import java.util.UUID;

class LibraryResource {
  protected String title;
  protected String description;
  protected String author;
  protected boolean isAvailable;
  protected String genre;
  private String resourceId;
  protected String isbn;
  protected int numPages;
  protected String publisher;
  protected String publishedYear;
  protected String language;
  protected ArrayList<String> checkedOutBy = new ArrayList<>();

  // Initialise
  public LibraryResource(String title, String author, String genre) {
    this.resourceId = UUID.randomUUID().toString();
    this.title = title;
    this.author = author;
    this.genre = genre;
  }

  // Accessors
  public String getTitle() {
    return title;
  }  

  public String getDescription() {
    return description;
  }

  public String getAuthor() {
    return author;
  }

  public boolean getIsAvailable() {
    return isAvailable;
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


  // Mutators
  public void setTitle(String title) {
   this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }
 
  public void setAuthor(String author) {
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
}
