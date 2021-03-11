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
        assertEquals("Factorial of positive integer ",3628800,calc.factorial(10),DELTA);
        assertEquals("Factorial of negative integer ", -1,calc.factorial(-200),DELTA);
    }

    @Test
    public void falseFactorial() {
        assertNotEquals("Factorial of positive integer ",29,calc.factorial(5),DELTA);
        assertNotEquals("Factorial of negative integer ", 120,calc.factorial(-11),DELTA);
    }

    @Test
    public void trueLogarithm() {
        assertEquals("Logarithm of positive integer ",5.06890420222,calc.log(159),DELTA);
        assertEquals("Logarithm of positive floating point number ", 3.10897166916,calc.log(22.398),DELTA);
        assertEquals("Logarithm of positive floating point number less than one", -0.25605421477,calc.log(0.7741),DELTA);
        assertEquals("Logarithm of negative real number ", NaN,calc.log(-702.922),DELTA);
    }

    @Test
    public void falseLogarithm() {
        assertNotEquals("Logarithm of positive integer ",13,calc.log(78),DELTA);
        assertNotEquals("Logarithm of positive floating point number ", NaN,calc.log(169.961),DELTA);
        assertNotEquals("Logarithm of positive floating point number less than one ", 3,calc.log(0.451382),DELTA);
        assertNotEquals("Logarithm of negative real number ", 62.301,calc.log(-0.00001578),DELTA);
    }

    @Test
    public void truePower() {
        assertEquals("Power of positive base and exponent ",1024,calc.pow(2, 10),DELTA);
        assertEquals("Power of positive base and negative exponent", 0.20804531060022668,calc.pow(3.7, -1.2),DELTA);
        assertEquals("Power of negative base and positive exponent", 0.0772628412137455,calc.pow(-0.7741, 10),DELTA);
        assertEquals("Power of negative base and exponent ", 1,calc.pow(-1, -2),DELTA);
    }

    @Test
    public void falsePower() {
        assertNotEquals("Power of positive base and exponent ",NaN,calc.pow(18, 1.2),DELTA);
        assertNotEquals("Power of positive base and negative exponent ", NaN,calc.pow(19.961, -0.05),DELTA);
        assertNotEquals("Power of negative base and positive exponent ", 3,calc.pow(-7.8, 2.3),DELTA);
        assertNotEquals("Power of negative base and exponent ", 62.301,calc.pow(-13, -6),DELTA);
    }
}