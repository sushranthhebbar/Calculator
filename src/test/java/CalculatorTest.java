import org.junit.jupiter.api.Assertions;

class CalculatorTest {

    @org.junit.jupiter.api.Test

    public void trueFactorial() {
        Calculator c = new Calculator();
        Assertions.assertEquals(c.factorial(5), 120);
    }
}