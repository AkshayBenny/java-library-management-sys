import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GuestTest {

    private Guest guest;

    @BeforeEach
    public void setUp() {
        guest = new Guest("Jane", "Doe", 3);
    }

    @Test
    @DisplayName("getFullName should return full name as Jane Doe")
    public void testGetFullName() {
        assertEquals("Jane Doe", guest.getFullName());
    }

    @Test
    @DisplayName("isAccessExpired should return false for a new access")
    public void testIsAccessExpired() {
        assertFalse(guest.isAccessExpired());
    }
}
