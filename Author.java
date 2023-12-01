import java.util.ArrayList;

/**
 * This class holds details about the Author
 *
 * @author Akshay
 * @version 1.0
 */
class Author {
    private String firstName;
    private String lastName;
    private int age;
    private String dob;
    private String address;
    private ArrayList<String> publications = new ArrayList<>();

    /**
     * Constructor for object of class Author
     * @param firstName first name
     * @param lastName last name
     */
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * An accessor to get the first name.
     *
     * @return string firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * An accessor to get the last name.
     *
     * @return string lastName
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
        return firstName + " " + lastName;
    }

    /**
     * An accessor to get the age of the author.
     *
     * @return int age
     */
    public int getAge() {
        return age;
    }

    /**
     * An accessor to get the date of birth of the author.
     *
     * @return string dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * An accessor to get the address of the author.
     *
     * @return string address
     */
    public String getAddress() {
        return address;
    }

    /**
     * An accessor to get the publications of the author.
     *
     * @return an arraylist of publications
     */
    public ArrayList<String> getPublications() {
        return new ArrayList<>(publications);
    }

    /**
     * An accessor to print the details of the author.
     */
    public void getAuthorDetails() {
        System.out.printf("Author name is %s %s\n", firstName, lastName);
        System.out.printf("Age of %s %s is %d and was born on %s\n", firstName, lastName, age, dob);

        if (address != null && !address.isEmpty()) {
            System.out.printf("%s %s lives at %s\n", firstName, lastName, address);
        } else {
            System.out.println("Address is not available.");
        }

        if (publications.isEmpty()) {
            System.out.println("No publications available.");
        } else {
            System.out.println("Publications:");
            for (String publication : publications) {
                System.out.println(publication);
            }
        }
    }

    /**
     * A mutator to set the first name of the author
     *
     * @param firstName first name of the author
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * A mutator to set the last name of the author
     *
     * @param lastName last name of the author
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * A mutator to set the age of the author
     *
     * @param age age of the author
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * A mutator to set the date of birth of the author
     *
     * @param dob date of birth of the author
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * A mutator to set the address of the author
     *
     * @param address address of the author
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * A mutator to add a publication of the author
     *
     * @param publication publication of the author
     */
    public void addPublication(String publication) {
        this.publications.add(publication);
    }

    /**
     * A mutator to remove a publication of the author
     *
     * @param publication publication of the author
     */
    public void removePublication(String publication) {
        this.publications.remove(publication);
    }
}
