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

  // Mutators
  public void setCanBeDownloaded(boolean isDownloadable) {
    this.canBeDownloaded = isDownloadable;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

}
