import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){

    }

    public static int factorial(int number)
    {
        logger.info("[MULTIPLICATION] - " + number);
        int result = 1;
        for(int i=1;i<=number;i++)
        {
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println(factorial(10));
    }
}
