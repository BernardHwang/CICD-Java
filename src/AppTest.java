// AppTest.java (JUnit 4)
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App("Hello, World!");
    }

    @Test
    public void testConstructorAndGetMessage() {
        assertEquals("Hello, World!", app.getMessage());
    }

    @Test
    public void testSetMessage() {
        app.setMessage("New Message");
        assertEquals("New Message", app.getMessage());
    }

    @Test
    public void testSetMessageNull() {
        app.setMessage(null);
        assertNull(app.getMessage());
    }
}
