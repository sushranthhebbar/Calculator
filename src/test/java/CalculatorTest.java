import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-7;
    Calculator calc = new Calculator();

    @Test
    public void trueSquareRoot() {
        assertEquals("Square root of positive integer ",2,calc.sqrt(4),DELTA);
        assertEquals("Square root of negative integer ", NaN,calc.sqrt(-2),DELTA);
        assertEquals("Square root of positive floating point number ", 5.588380803059147,calc.sqrt(31.23),DELTA);
        assertEquals("Square root of negative floating point number ", NaN,calc.sqrt(-7.891),DELTA);
    }

    @Test
    public void falseSquareRoot() {
        assertNotEquals("Square root of positive integer ",24,calc.sqrt(25),DELTA);
        assertNotEquals("Square root of negative integer ", 3.7,calc.sqrt(-300),DELTA);
        assertNotEquals("Square root of positive floating point number ", NaN,calc.sqrt(1587.4333312),DELTA);
        assertNotEquals("Square root of negative floating point number ", 62,calc.sqrt(-0.00001578),DELTA);
    }

    @Test
    public void trueFactorial() {
        assertEquals("Square root of positive integer ",3628800,calc.factorial(10),DELTA);
        assertEquals("Square root of negative integer ", -1,calc.factorial(-200),DELTA);
    }

    @Test
    public void falseFactorial() {
        assertNotEquals("Square root of positive integer ",29,calc.factorial(5),DELTA);
        assertNotEquals("Square root of negative integer ", 120,calc.factorial(-11),DELTA);
    }

}