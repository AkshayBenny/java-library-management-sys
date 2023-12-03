import java.util.ArrayList;

/**
 * This class holds details about the Member
 *
 * @author Akshay
 * @version 1.0
 */
class Member {
  private String firstName;
  private String lastName;
  private String memberId;
  private ArrayList<LibraryResource> resourcesBorrowed = new ArrayList<>();

  /**
   * Constructor for object of class Member
   * 
   * @param firstName first name of the Member
   * @param lastName  last name of the Member
   * @param memberId  id of the Member
   */
  public Member(String firstName, String lastName, String memberId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.memberId = memberId;
  }

  /**
   * An accessor to get the first name.
   *
   * @return string first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * An accessor to get the last name.
   *
   * @return string last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * An accessor to get the full name.
   *
   * @return string full name
   */
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  /**
   * An accessor to get the membership id.
   *
   * @return string membership id
   */
  public String getMemberId() {
    return memberId;
  }

  /**
   * An accessor to get the list of resources used.
   *
   * @return array list of resources
   */
  public ArrayList<LibraryResource> getResourcesUsed() {
    return resourcesBorrowed;
  }

  /**
   * An accessor to get the number of resources used.
   *
   * @return int number of resources used
   */
  public int getNumberOfResourcesBorrowed() {
    return resourcesBorrowed.size();
  }

  /**
   * An accessor to print the details related to this member
   */
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

  /**
   * An accessor to print the details of the resources used by the member
   */
  public void printResourcesUsed() {
    if (resourcesBorrowed.size() > 0) {
      System.out.println("The following are the resources borrowed by the member:");
      for (LibraryResource resource : resourcesBorrowed) {
        resource.getDetails();
      }
    }
  }

  /**
   * A mutator to set the first name of the member
   *
   * @param firstName first name of the member
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A mutator to set the last name of the member
   *
   * @param lastName last name of the member
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A mutator to set the member id
   *
   * @param memberId member id
   */
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * A mutator to add a library resource
   *
   * @param resource resource to be added to the array list of resources
   */
  public void addResource(LibraryResource resource) {
    if (!resourcesBorrowed.contains(resource)) {
      this.resourcesBorrowed.add(resource);
    } else {
      System.out.println("This resource already exists");
    }
  }

  /**
   * A mutator to remove a library resource from the array list of resources
   *
   * @param resource library resource to be removed
   */
  public void removeResource(LibraryResource resource) {
    if (resourcesBorrowed.contains(resource)) {
      this.resourcesBorrowed.remove(resource);
    } else {
      System.out.println("This resource does not exist.");
    }
  }

}
