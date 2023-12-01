import java.util.ArrayList;

/**
 * This class holds details about the Guest
 *
 * @author Akshay
 * @version 1.0
 */
class Guest {
  private String firstName;
  private String lastName;
  private ArrayList<ElectronicResource> resourcesUsed = new ArrayList<>();
  private LibraryAccess libraryAccess;

  /**
   * Constructor for objects of class Guest
   */
  public Guest(String firstName, String lastName, int accessDuration) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.libraryAccess = new LibraryAccess(accessDuration);
  }

  /**
   * An accessor to get the first name.
   *
   * @return string firstName
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * An accessor to get the last name.
   *
   * @return string lastName
   */
  public String getLastName() {
    return this.lastName;
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
   * An accessor to get the list of resources used by the guest.
   *
   * @return array list of resources used by the guest
   */
  public ArrayList<ElectronicResource> getResourcesUsed() {
    return resourcesUsed;
  }

  /**
   * An accessor to print the details of the resources used by the guest.
   */
  public void printResourcesUsed() {
    for (ElectronicResource resource : resourcesUsed) {
      resource.getDetails();
    }
  }

  /**
   * An accessor to get if the access of this guest expired or not.
   *
   * @return boolean indicating whether the guest access is expired or not.
   */
  public boolean isAccessExpired() {
    return libraryAccess.isExpired();
  }

  /**
   * An accessor to print the access details.
   */
  public void printAccessDetails() {
    System.out.println("Access duration: " + libraryAccess.getDuration() + " days");
    System.out.println("Access expires on: " + libraryAccess.getExpiryDate());
    System.out.println("Access expired: " + isAccessExpired());
  }

  /**
   * A mutator to set the first name of the guest
   *
   * @param firstName first name of the guest
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A mutator to set the last name of the guest
   *
   * @param firstName last name of the guest
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A mutator to add resources borrowed by the guest
   *
   * @param resource resource to be added
   */
  public void addResource(ElectronicResource resource) {
    this.resourcesUsed.add(resource);
  }

  /**
   * A mutator to remove resources borrowed by the guest
   *
   * @param resource resource to be removed
   */
  public void removeResource(ElectronicResource resource) {
    this.resourcesUsed.remove(resource);
  }
}
