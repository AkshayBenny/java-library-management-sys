class Book {
  private String title;
  private String author;
  private boolean isAvailable;


  public Book(String title, String author){
    this.title = title;
    this.author = author;
    this.isAvailable = true;
  }

 // Accessors
 public String getTitle() { 
  return title;
 }

 public String getAuthor() {
   return author;
 }

 public boolean isAvailable() {
   return isAvailable;
 }

 //Mutators
 public void setTitle(String title){
   this.title = title;
 }

 public void setAuthor(String author){
   this.author = author;
 }

 public void setIsAvailable(boolean isAvailable){
   this.isAvailable = isAvailable;
 }
}
