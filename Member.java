import java.util.ArrayList;

class Member {
  private String firstName;
  private String lastName;
  private String memberId;
  private ArrayList<LibraryResource> resourcesUsed = new ArrayList<>();
  private ArrayList<PhysicalResource> physicalResourcesUsed = new ArrayList<>();
  private ArrayList<ElectronicResource> electornicResourcesUsed = new ArrayList<>();

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

  public String getMemberId() {
    return memberId;
  }

  public ArrayList<LibraryResource> getResourcesUsed() {
    return resourcesUsed;
  }

  public void printResourcesUsed() {
    if (resourcesUsed.isEmpty()) {
      System.out.printf("This member currently has not borrowed any resources.\n");
    } else {
      int resourceCounter = 1;
      System.out.printf("The following are the resources borrowed by the member:\n");
      for (LibraryResource resource : resourcesUsed) {
        System.out.printf("%d) %s by %s", resourceCounter, resource.getTitle(), resource.getAuthor());
      }
    }
  }

  public void getMemberDetails() {
    System.out.printf("Member name is %s %s\n", firstName, lastName);
    System.out.printf("Member ID is %s\n", memberId);
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

  public void addResource(LibraryResource resource){
    this.resourcesUsed.add(resource);
  }

  public void removeResource(LibraryResource resource){
    this.resourcesUsed.remove(resource);
  }

}
