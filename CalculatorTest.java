import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @Tag("first-priority")
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @Tag("second-priority")
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.add(100, 200);
        assertEquals(250, result);
    }
}