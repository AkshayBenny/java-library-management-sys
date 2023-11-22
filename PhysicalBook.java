import java.utils.ArrayList;

class PhysicalResource extends LibraryResource {
  private ArrayList<String> damages = new ArrayList<>();
  private String bookCoverType;
  private String shelfLocation;
  private String dimensions;
  

  public PhysicalResource(String title, String description, String author, boolan isAvailable, String genre, String isbn, int numPages, String publisher, String publishedYear, String language) {
    super(title, description, author, isAvailable, genre, isbn, numPages, publisher, publishedYear, language);

    this.bookCoverType = bookCoverType;
    this.shelfLocation = shelfLocation;
  }

  // Accesors
  public String getBookCoverType() {
    return bookCoverType;
  }

  public String getShelfLocation() {
    return shelfLocation;
  }

  public String getDimensions() {
    return dimensions;
  }


  // Mutators
  public void setBookCoverType(String bookCoverType) {
    this.bookCoverType = bookCoverType;
  }

  public void setShelfLocation(String shelfLocation) {
    this.shelfLocation = shelfLocation;
  }

  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

}
