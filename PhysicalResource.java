import java.util.ArrayList;

/**
 * This class holds details about the Physical Resource
 * This class extends the LibraryResource class and implements additional
 * methods
 * 
 * @author Akshay
 * @version 1.0
 */
class PhysicalResource extends LibraryResource {
  private ArrayList<String> damages = new ArrayList<>();
  private String bookCoverType;
  private String shelfLocation;
  private String dimensions;
  private boolean isAvailable;

  /**
   * Constructor for object of class Author
   * 
   * @param title         Title of the book
   * @param author        Author of the book
   * @param genre         Genre of the book
   * @param bookCoverType Book cover type
   */
  public PhysicalResource(String title, Author author, String genre, String bookCoverType) {
    super(title, author, genre);
    this.bookCoverType = bookCoverType;
  }

  /**
   * An accessor to get the book cover type.
   *
   * @return string book cover type
   */
  public String getBookCoverType() {
    return bookCoverType;
  }

  /**
   * An accessor to get the shelf location of the book.
   *
   * @return string shelf location
   */
  public String getShelfLocation() {
    return shelfLocation;
  }

  /**
   * An accessor to get the dimentsions of the book.
   *
   * @return string dimentsion of the book
   */
  public String getDimensions() {
    return dimensions;
  }

  /**
   * An accessor to get if the book is available or not.
   *
   * @return boolean is available or not
   */
  public boolean getIsAvailable() {
    return this.isAvailable;
  }

  /**
   * An accessor to print the details related to this book
   */
  @Override
  public void getDetails() {
    super.getDetails();

    if (shelfLocation == null || shelfLocation.equals("")) {
      System.out.printf("Shelf location: Parameter has not been entered yet.\n");
    } else {
      System.out.printf("Shelf location: %s\n", shelfLocation);
    }

    if (dimensions == null || dimensions.equals("")) {
      System.out.printf("Dimensions: Parameter has not been entered yet.\n");
    } else {
      System.out.printf("Dimensions: %s\n", dimensions);
    }

    if (damages.isEmpty()) {
      System.out.println("No damages entered yet.");
    } else {
      System.out.printf("Damages recieved: \n");
      int damageCounter = 1;
      for (String damage : damages) {
        System.out.printf("%d) %s", damageCounter, damage);
        damageCounter++;
      }
    }
  }

  /**
   * A mutator to set book cover type
   *
   * @param bookCoverType type of book cover
   */
  public void setBookCoverType(String bookCoverType) {
    this.bookCoverType = bookCoverType;
  }

  /**
   * A mutator to set location of book in the shelf
   *
   * @param shelfLocation shelf location
   */
  public void setShelfLocation(String shelfLocation) {
    this.shelfLocation = shelfLocation;
  }

  /**
   * A mutator to set dimension of book
   *
   * @param dimensions dimentions of the book
   */
  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * A mutator to add damages recieved to the book
   *
   * @param damage damage recieved to the book
   */
  public void addDamage(String damage) {
    this.damages.add(damage);
  }

  /**
   * A mutator to remove damage to the book
   *
   * @param damage damage to be removed
   */
  public void removeDamage(String damage) {
    this.damages.remove(damage);
  }

  /**
   * A mutator to set the availability of the book
   *
   * @param isAvailable availability of the book
   */
  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

}
