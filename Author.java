import java.util.ArrayList;

class Author {
  private String firstName;
  private String lastName;
  private int age;
  private String dob;
  private String address;
  private ArrayList<String> publications = new ArrayList<>();
  

  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // Accessors
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public int getAge() {
    return age;
  }

  public String dob() {
    return dob;
  }

  public String address() {
    return address;
  }

  public ArrayList<String> getPublications() {
    return publications;
  }

  public void getAuthorDetails() {
    System.out.printf("Author name is %s %s\n", firstName, lastName);
    System.out.printf("Age of %s %s is %d and was born on %s", firstName, lastName, age, dob);
    
    if(address.equals(null) || address.equals("")) {
      System.out.printf("%s %s lives at %s", firstName, lastName, address);
    }

    if(publications.isEmpty()) {
      System.out.printf("%s %s has no publications so far");
    } else {
      int publicationCount = 1;
      System.out.printf("The following are the publications of %s %s", firstName, lastName);
      for (String publication: publications) {
        System.out.printf("%d) %s\n", publicationCount, publication);
        publicationCount ++;
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

  public void setAge(int age) {
    this.age = age;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void addPublications(String publication) {
    this.publications.add(publication);
  }

  public void removePublication(String publication) {
    this.publications.remove(publication);
  }

}
