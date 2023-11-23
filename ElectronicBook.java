class ElectronicResource {
  private boolean canBeDownloaded;
  private String fileSize;

  public ElectronicResource(String title, String author, String genre) {
    super(title, author, genre);
  }

  // Accessors
  public boolean getCanBeDownloaded() {
    return canBeDownloaded;
  }

  public String getFileSize() {
    return fileSize;
  }

  public void getElectronicResourceDetails() {
    System.out.printf("The name of the book is %s", title);
    System.out.printf("%s is the author", author);
    System.out.printf("and it belongs to the genre %s", genre);
    
    if (canBeDownloaded) {
      System.out.println("This book can be downloaded");
    } else {
      System.out.println("This book cannot be downloaded";)
    }

    if (fileSize.isEmpty()) {
      System.out.printf("File size: This parameter has not been entered yet.");
    } else {
      System.out.printf("File size: %s", fileSize);
    }

  }

  // Mutators
  public void setCanBeDownloaded(boolean isDownloadable) {
    this.canBeDownloaded = isDownloadable;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

}
