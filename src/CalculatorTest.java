import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void testAddition() {
        double result = Calculator.add(5, 3);
        assertEquals(8, result, 0);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.subtract(5, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.multiply(5, 3);
        assertEquals(15, result, 0);
    }

    @Test
    public void testDivision() {
        double result = Calculator.divide(10, 2);
        assertEquals(5, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.divide(10, 0);
    }
}
