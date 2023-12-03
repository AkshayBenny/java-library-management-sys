import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LibraryResourceTest {

    private LibraryResource resource;
    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("JRR", "Tolkien");
        resource = new LibraryResource("The Hobbit", author, "fantasy adventure");
    }

    @Test
    @DisplayName("getTitle should return The Hobbit")
    public void testGetTitle() {
        assertEquals("The Hobbit", resource.getTitle());
    }

    @Test
    @DisplayName("getGenre should return fantasy adventure")
    public void testGetGenre() {
        assertEquals("fantasy adventure", resource.getGenre());
    }
}
