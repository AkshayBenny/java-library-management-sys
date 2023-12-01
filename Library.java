import java.util.ArrayList;

/**
 * This class holds details about the Library. This class basically acts as the
 * database for different resources created and resources loaned to users.
 *
 * @author Akshay
 * @version 1.0
 */
class Library {
  private ArrayList<LibraryResource> resources = new ArrayList<>();
  private ArrayList<Object> peoples = new ArrayList<>();
  private ArrayList<LibraryResource> resourcesOnLoan = new ArrayList<>();

  /**
   * Constructor for objects of class Library
   */
  public Library() {
    this.resources = new ArrayList<>();
    this.peoples = new ArrayList<>();
  }

  /**
   * An accessor to get the resources available.
   *
   * @return array list of resources created
   */
  public ArrayList<LibraryResource> getResources() {
    return this.resources;
  }

  /**
   * An accessor to get the users both members and guests.
   *
   * @return array list of users
   */
  public ArrayList<Object> getPeoples() {
    return this.peoples;
  }

  /**
   * An accessor to print the resources available.
   */
  public void printAllResources() {
    int resourceCounter = 1;
    if (resources.isEmpty()) {
      System.out.println("Currently no resources are availabele!");
    } else {
      for (LibraryResource resource : this.resources) {
        System.out.printf("%d) ", resourceCounter);
        resource.getDetails();
        System.out.println("");
        resourceCounter++;
      }
    }
  }

  /**
   * An accessor to print the physical resources available.
   */
  public void printAllPhysicalResources() {
    int physicalResourceCounter = 1;
    if (resources.isEmpty()) {
      System.out.println("No physical books currently exists!");
    } else {
      for (LibraryResource resource : resources) {
        if (resource instanceof PhysicalResource) {
          System.out.printf("%d) ", physicalResourceCounter);
          resource.getDetails();
          physicalResourceCounter++;
        }
      }
    }
  }

  /**
   * An accessor to print the electronic resources available.
   */
  public void printAllElectronicResources() {
    int electronicResourceCounter = 1;
    if (resources.isEmpty()) {
      System.out.println("No electornic books currently exists!");
    } else {
      for (LibraryResource resource : resources) {
        if (resource instanceof ElectronicResource) {
          System.out.printf("%d) ", electronicResourceCounter);
          resource.getDetails();
          electronicResourceCounter++;
        }
      }
    }
  }

  /**
   * An accessor to print the members registered.
   */
  public void printAllPeoples() {
    int peopleCounter = 1;
    if (peoples.isEmpty()) {
      System.out.println("Currently no members are registered");
    } else {
      for (Object people : peoples) {
        if (people instanceof Member) {
          Member member = (Member) people;
          System.out.printf("%d) %s\n", peopleCounter, member.getFullName());
          peopleCounter++;
        }
      }
    }
  }

  /**
   * An accessor to print all the details such as the resources currently
   * available and members.
   */
  public void getDetails() {
    int resourceCounter = 1;
    if (resources.isEmpty()) {
      System.out.println("Currently no resources are available!");
    } else {
      for (LibraryResource resource : this.resources) {
        System.out.printf("%d) ", resourceCounter);
        resource.getDetails();
        System.out.println("");
        resourceCounter++;
      }
    }

    int peopleCounter = 1;
    if (peoples.isEmpty()) {
      System.out.println("Currently no members are registered.");
    } else {
      for (Object people : peoples) {
        if (people instanceof Member) {
          Member member = (Member) people; // Cast to Member
          System.out.printf("%d) %s\n", peopleCounter, member.getFullName());
          peopleCounter++;
        }
      }
    }
  }

  /**
   * An accessor to check if a particular resource is present in the library or
   * not.
   *
   * @return boolean indicating whether the resource is present in the library or
   *         not
   */
  public boolean resourceChecker(LibraryResource resource) {
    return resources.contains(resource);
  }

  /**
   * An accessor to search for a particular resource by title.
   */
  public void searchByResourceTitle(String title) {
    int resourcesFound = 0;

    for (LibraryResource resource : resources) {
      if (resource.getTitle().equals(title)) {
        resourcesFound++;
        resource.getDetails();
      }
    }

    System.out.printf("%d resources found!", resourcesFound);
  }

  /**
   * An accessor to search for a particular resource by author's last name.
   */
  public void searchByAuthorLastName(String lastName) {
    int resourcesFound = 0;
    for (LibraryResource resource : resources) {
      Author author = resource.getAuthor();
      if (author.getLastName().toLowerCase().equals(lastName.toLowerCase())) {
        resourcesFound++;
        resource.getDetails();
        resource.printBorrowedByDetails();
      }
    }

    System.out.printf("%d resources found", resourcesFound);
  }

  /**
   * An accessor to print all available resources.
   */
  public void getAllAvailableResources() {
    ArrayList<LibraryResource> availableResources = new ArrayList<>();
    int availableResourceCounter = 1;
    for (LibraryResource resource : resources) {
      if (!resourcesOnLoan.contains(resource) && resource instanceof PhysicalResource) {
        availableResources.add(resource);
      }
    }

    if (availableResources.isEmpty()) {
      System.out.println("No resources available.");
      return;
    }

    for (LibraryResource resource : availableResources) {
      System.out.printf("%d) ", availableResourceCounter);
      resource.getDetails();
    }
  }

  /**
   * An accessor to get the number of resources in the library.
   *
   * @return int number of resources in the library
   */
  public int getNumberOfResources() {
    return resources.size();
  }

  /**
   * A mutator to append a new resource to the list of resources
   *
   * @param resource resource to be added
   */
  public void addResource(LibraryResource resource) {
    if (resources.contains(resource)) {
      System.out.println("This resource already exists!");
      return;
    }
    this.resources.add(resource);
  }

  /**
   * A mutator to remove a resource from the list of resources
   *
   * @param resource resource to be removed
   */
  public void removeResource(LibraryResource resource) {
    if (resources.contains(resource) && resourcesOnLoan.contains(resource)) {
      System.out.println("This resource is currently out on loan.");
    } else if (resources.contains(resource)) {
      this.resources.remove(resource);
    } else {
      System.out.println("Resource not found!");
    }
  }

  /**
   * A mutator to remove a resource from the list of resources from a particular
   * index
   *
   * @param index index of resource to be removed
   */
  public void removeResourceAtIndex(int index) {
    if (index - 1 >= resources.size() || index <= 0) {
      System.out.println("Index is invalid or out of range!");
      return;
    }
    LibraryResource resource = resources.get(index - 1);
    if (resourcesOnLoan.contains(resource)) {
      System.out.println("This resource is currently on loan!");
    } else {
      resources.remove(index - 1);
    }
  }

  /**
   * A mutator to add people to the list of peoples
   *
   * @param people people object to be added
   */
  public void addPeople(Object people) {
    this.peoples.add(people);
  }

  /**
   * A mutator to show the functionality of borrowing a book
   *
   * @param person  Object of person borrowing the book
   * @param bookNum index of the book to be borrowed from the resources array list
   */
  public void borrowBook(Object person, int bookNum) {
    if (bookNum <= resources.size() && bookNum >= 0) {
      LibraryResource myBook = resources.get(bookNum - 1);
      if (myBook instanceof ElectronicResource && person instanceof Guest) {
        Guest guest = (Guest) person;
        if (myBook instanceof ElectronicResource) { // Double-check cast
          guest.addResource((ElectronicResource) myBook);
          addResourceOnLoan(myBook);
          myBook.setBorrowedBy(guest);
        }
      } else if (myBook instanceof PhysicalResource && person instanceof Guest) {
        System.out.println("Unfortunately, you are not a member so you can only borrow electronic resources.");
      } else if (person instanceof Member) {
        Member member = (Member) person;
        member.addResource(myBook);
        addResourceOnLoan(myBook);
        myBook.setBorrowedBy(member);
      }
    }
  }

  /**
   * A mutator to show the functionality of borrowing a physical book
   *
   * @param book   Object of book to be borrowed
   * @param member Object of member borrowing the book
   */
  public void borrowPhysicalResource(PhysicalResource book, Member member) {
    if (!resources.contains(book)) {
      System.out.println("This book is not in the library database.");
      return;
    }

    if (resourcesOnLoan.contains(book)) {
      System.out.println("This book is currently on loan!");
      return;
    }

    book.setBorrowedBy(member);
    member.addResource(book);
    resourcesOnLoan.add(book);

    System.out.println("Book has been successfully lent to " + member.getFullName());
  }

  /**
   * A mutator to show the functionality of returning a book
   *
   * @param book              Object of book to be returned
   * @param hasDamage         boolean indicating whether the book is currently
   *                          damaged or not
   * @param damageDescription a description of damage if any
   */
  public void returnPhysicalBook(PhysicalResource book, boolean hasDamage, String damageDescription) {
    if (!resources.contains(book)) {
      System.out.println("This book is not currently in the library!");
      return;
    }

    if (hasDamage && damageDescription != null && !damageDescription.trim().isEmpty()) {
      book.addDamage(damageDescription);
    }

    resourcesOnLoan.remove(book);
  }

  /**
   * A mutator to set the first name of the author of a particular resource
   *
   * @param newFirstName the new first name of the author of the resource
   * @param resource     the resource belonging to the author whose first name is
   *                     to be changed
   */
  public void setAuthorFirstName(String newFirstName, LibraryResource resource) {
    if (!resources.contains(resource)) {
      System.out.println("Resource not found in the resource database!");
      return;
    }

    if (resource.getAuthor() == null) {
      System.out.println("This resource does not have an author assigned.");
      return;
    }

    resource.getAuthor().setFirstName(newFirstName);

  }

  /**
   * A mutator to add a particular resource which was given out on loan to a
   * member
   *
   * @param resource Resource to be loaned
   */
  public void addResourceOnLoan(LibraryResource resource) {
    if (resources.contains(resource)) {
      System.out.println("This resource does not exit in the database!");
    } else if (resourcesOnLoan.contains(resource)) {
      System.out.println("This resource is already out on loan!");
    } else {
      resourcesOnLoan.add(resource);
    }
  }

  /**
   * A mutator to remove a particular resource from the array list representing
   * the resources given out on loan
   *
   * @param resource Resource to be loaned
   */
  public void removeResourceOnLoan(LibraryResource resource) {
    if (resourcesOnLoan.contains(resource)) {
      resourcesOnLoan.remove(resource);
    }
  }

}
