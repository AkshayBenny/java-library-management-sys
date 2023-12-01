import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ElectronicResourceTest {

    private ElectronicResource resource;
    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("JRR", "Tolkien");
        resource = new ElectronicResource("1999", author, "fantasy");
        resource.setCanBeDownloaded(true);
        resource.setFileSize("1MB");
        resource.setTypeOfElectronicResource("pdf");
    }

    @Test
    @DisplayName("getCanBeDownloaded should return true")
    public void testGetCanBeDownloaded() {
        assertTrue(resource.getCanBeDownloaded());
    }

    @Test
    @DisplayName("getFileSize should return 1MB")
    public void testGetFileSize() {
        assertEquals("1MB", resource.getFileSize());
    }

    @Test
    @DisplayName("getTypeOfElectronicResource should return pdf")
    public void testGetTypeOfElectronicResource() {
        assertEquals("pdf", resource.getTypeOfElectronicResource());
    }
}
