/**
 * This class holds details about the Electornic resources such as pdfs,
 * journals etc.
 *
 * @author Akshay
 * @version 1.0
 */
class ElectronicResource extends LibraryResource {
  private boolean canBeDownloaded;
  private String fileSize;
  private String typeOfElectornicResource;

  /**
   * Constructor for objects of class ElectronicResource
   */
  public ElectronicResource(String title, Author author, String genre) {
    super(title, author, genre);
  }

  /**
   * An accessor to get if this resources can be downloaded or not.
   *
   * @return boolean true if this resources can be downloaded
   */
  public boolean getCanBeDownloaded() {
    return canBeDownloaded;
  }

  /**
   * An accessor to get the size of this resource
   *
   * @return string size of this resource
   */
  public String getFileSize() {
    return fileSize;
  }

  /**
   * An accessor to get the type of this resource. It could be pdf, journal etc.
   *
   * @return string type of this resource
   */
  public String getTypeOfElectronicResource() {
    return this.typeOfElectornicResource;
  }

  /**
   * An accessor to print the details of this resource
   */
  public void getDetails() {
    super.getDetails();
    if (canBeDownloaded) {
      System.out.println("This book can be downloaded");
    } else {
      System.out.println("This book cannot be downloaded");
    }

    if (fileSize == null || fileSize.equals("")) {
      System.out.printf("File size: This parameter has not been entered yet.\n");
    } else {
      System.out.printf("File size: %s\n", fileSize);
    }

  }

  /**
   * A mutator to set if this resource can be downloaded or not.
   *
   * @param isDownloadable to set if this resource can be downloaded
   */
  public void setCanBeDownloaded(boolean isDownloadable) {
    this.canBeDownloaded = isDownloadable;
  }

  /**
   * A mutator to set the file size of this resource.
   *
   * @param fileSize size of the resource file
   */
  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * A mutator to set the type of this resource.
   *
   * @param typeOfElectornicResource type of resource for example pdf, journal
   *                                 etc.
   */
  public void setTypeOfElectronicResource(String typeOfElectornicResource) {
    this.typeOfElectornicResource = typeOfElectornicResource;
  }

}
