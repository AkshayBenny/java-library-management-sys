import java.util.ArrayList;

class PhysicalResource extends LibraryResource {
  private ArrayList<String> damages = new ArrayList<>();
  private String bookCoverType;
  private String shelfLocation;
  private String dimensions;
  private boolean isAvailable; // connect this to library class
  // private Member borrowedBy; // connect this to library class and main class

  public PhysicalResource(String title, Author author, String genre, String bookCoverType) {
    super(title, author, genre);
    this.bookCoverType = bookCoverType;
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

  public boolean getIsAvailable() {
    return this.isAvailable;
  }

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

  public void addDamage(String damage) {
    this.damages.add(damage);
  }

  public void removeDamage(String damage) {
    this.damages.remove(damage);
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

}
