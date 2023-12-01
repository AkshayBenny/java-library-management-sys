class Main {
  public static void main(String[] args) {
    Library library = new Library();

    // Create an author
    Author author = new Author("JRR", "Tolkien");
    author.setAge(82);
    author.setDob("10-03-1909");
    author.setAddress("Parsonage Row Blah Blah");
    author.addPublication("Once upon a time in hollywood");
    author.addPublication("The Simarillion");
    author.addPublication("The hobbit");

    // author.getAuthorDetails();

    // Create a new member
    Member memberJohn = new Member("John", "Doe", "1001");
    Member memberJane = new Member("Jane", "Doe", "1002");
    
    // Create a new guest
    Guest guestMary = new Guest("Mary", "Jane", 3);
    Guest guestPeter = new Guest("Peter", "Parker", 3);

    // Create a library resource
    // Resource 1
    PhysicalResource book1 = new PhysicalResource("Lord of the rings", author, "fantasy", "hard cover");

    //Resource 2
    ElectronicResource ebook1 = new ElectronicResource("The hobbi", author, "fantasy");


    // Add resources and peoples to the library object
    library.addResource(book1);
    library.addResource(ebook1);

    library.addPeople(memberJohn);
    library.addPeople(memberJane);
    library.printAllResources();
    // borrow book feature
    
    // when a book is borrowed 
    // - check if member 
    // - remove borrowed book from Libresource array  
    // - add book to borrowed list of member
    // 
    

    // change the author type in electornicresource
  }
}
