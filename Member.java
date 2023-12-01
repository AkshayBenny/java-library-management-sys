import java.util.ArrayList;

class Member {
  private String firstName;
  private String lastName;
  private String memberId;
  private ArrayList<LibraryResource> resourcesBorrowed = new ArrayList<>();

  public Member(String firstName, String lastName, String memberId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.memberId = memberId;
  }

  // Accessors
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public String getMemberId() {
    return memberId;
  }

  public ArrayList<LibraryResource> printResourcesUsed() {
    return resourcesBorrowed;
  }

  public int getNumberOfResourcesBorrowed() {
    return resourcesBorrowed.size();
  }

  public void getMemberDetails() {
    System.out.printf("Member name is %s %s\n", firstName, lastName);
    System.out.printf("Member ID is %s\n", memberId);

    if (resourcesBorrowed.size() > 0) {
      System.out.println("The following are the resources borrowed by the member:");
      for (LibraryResource resource : resourcesBorrowed) {
        resource.getDetails();
      }
    }
  }

  public void printResourcesUsed() {
    if (resourcesBorrowed.size() > 0) {
      System.out.println("The following are the resources borrowed by the member:");
      for (LibraryResource resource : resourcesBorrowed) {
        resource.getDetails();
      }
    }
  }

  // Mutators
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public void addResource(LibraryResource resource) {
    if (!resourcesBorrowed.contains(resource)) {
      this.resourcesBorrowed.add(resource);
    } else {
      System.out.println("This resource already exists");
    }
  }

  public void removeResource(LibraryResource resource) {
    if (resourcesBorrowed.contains(resource)) {
      this.resourcesBorrowed.remove(resource);
    } else {
      System.out.println("This resource does not exist.");
    }
  }

}
