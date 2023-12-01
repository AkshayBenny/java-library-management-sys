import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberTest {

    private Member member;

    @BeforeEach
    public void setUp() {
        member = new Member("Jane", "Doe", "1234567890");
    }

    @Test
    @DisplayName("getFullName should return full name as Jane Doe")
    public void testGetFullName() {
        assertEquals("Jane Doe", member.getFullName());
    }
}