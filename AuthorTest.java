import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AuthorTest {

    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("John", "Doe");
        author.setAge(24);
        author.setDob("09-08-1999");
        author.setAddress("Aerathukunnel House, Th Road 123");
        author.addPublication("RD Sharma");
    }

    @Test
    @DisplayName("getFullName should return full name as John Doe")
    public void testGetFullName() {
        assertEquals("John Doe", author.getFullName());
    }

    @Test
    @DisplayName("getFirstName should return first name as John")
    public void testGetFirstName() {
        assertEquals("John", author.getFirstName());
    }

    @Test
    @DisplayName("getLastName should return last name as Doe")
    public void testGetLastName() {
        assertEquals("Doe", author.getLastName());
    }

    @Test
    @DisplayName("getAge should return age as 24")
    public void testGetAge() {
        assertEquals(30, author.getAge());
    }

    @Test
    @DisplayName("getDob should return date of birth as 09-08-1999")
    public void testGetDob() {
        assertEquals("09-08-1999", author.getDob());
    }

    @Test
    @DisplayName("getAddress should return address as Aerathukunnel House, Th Road 123")
    public void testGetAddress() {
        assertEquals("Aerathukunnel House, Th Road 123", author.getAddress());
    }

    @Test
    @DisplayName("adding publication to the list should make the size of the list 2 and should contain both the added publications")
    public void testAddPublication() {
        author.addPublication("Mathew Sharma");
        ArrayList<String> publications = author.getPublications();
        assertEquals(2, publications.size(), "The size of the publications arraylist should be 2");
        assertTrue(publications.contains("RD Sharma"), "The publications should contain RD Sharma");
        assertTrue(publications.contains("Mathew Sharma"), "The publications should contain Mathew Sharma");
    }

    @Test
    @DisplayName("removePublication should remove the corresponding publication")
    public void testRemovePublication() { 
        author.removePublication("RD Sharma");
        ArrayList<String> publications = author.getPublications();
        assertFalse(publications.contains("RD Sharma"),
                "The publication should not contain RD Sharma after removing");
    }
}
