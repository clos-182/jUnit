import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, mathUtils.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(5, 0));
    }
}
