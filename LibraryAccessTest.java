import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LibraryAccessTest {

    private LibraryAccess access;

    @BeforeEach
    public void setUp() {
        access = new LibraryAccess(3);
    }

    @Test
    @DisplayName("getDuration should return 3")
    public void testGetDuration() {
        assertEquals(3, access.getDuration());
    }

    @Test
    @DisplayName("isExpired should return false when trying to access again")
    public void testIsExpired() {
        assertFalse(access.isExpired());
    }
}
