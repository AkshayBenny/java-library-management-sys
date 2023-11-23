class Main {
  public static void main(String[] args) {
    // Create an author
    Author author = new Author("JRR", "Tolkien");
    author.setAge(82);
    author.setDob("10-03-1909");
    author.setAddress("Parsonage Row Blah Blah");
    author.addPublications("Once upon a time in hollywood");
    author.addPublications("The Simarillion");
    author.addPublications("The hobbit");

    author.getAuthorDetails();

    // Create a new member
    Member memberJohn = new Member("John", "Doe", "1001");

    // Create a library resource
    LibraryResource libraryResource = new LibraryResource("Lord of the Rings", author,"fantasy");
    libraryResource.setDescription("This is a book about Middle Earth");
    libraryResource.setPublisher("Random publications");
    libraryResource.setIsAvailable(true);
    libraryResource.setIsbn("2309482304982039");
    libraryResource.setNumPages(349);
    libraryResource.setPublishedYear("1992");
    libraryResource.setLanguage("English");


  }
}
