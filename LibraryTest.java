import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    @DisplayName("addResource should add a resource to the library")
    public void testAddResource() {
        Author author = new Author("JRR", "Tolkien");
        ElectronicResource resource = new ElectronicResource("The Lord Of The Rings", author, "fantasy, adventure");
        library.addResource(resource);
        assertEquals(1, library.getResources().size());
    }
}
