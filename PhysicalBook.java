import java.util.ArrayList;

class PhysicalResource extends LibraryResource {
  private ArrayList<String> damages = new ArrayList<>();
  private String bookCoverType;
  private String shelfLocation;
  private String dimensions;
  
  public PhysicalResource(String title, Author author, String genre, String bookCoverType, String shelfLocation) {
    super(title, author, genre);
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

  public void getPhysicalBookDetails() {
    System.out.printf("The name of the book is %s", title);
    System.out.printf("%s is the author", author);
    System.out.printf("and it belong to the genre %s", genre);

    if (bookCoverType.isEmpty()) {
      System.out.printf("Book cover type: Parameter not been entered yet.");
    } else {
      System.out.printf("Book cover type: %s", bookCoverType);
    }

    if (shelfLocation.isEmpty()) {
      System.out.printf("Shelf location: Parameter has not been entered yet.");
    } else {
      System.out.printf("Shelf location: %s", shelfLocation);
    }

    if (dimensions.isEmpty()) {
      System.out.printf("Dimensions: Parameter has not been entered yet.");
    } else {
      System.out.printf("Dimensions: %s", dimensions);
    }

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
