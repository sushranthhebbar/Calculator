import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger();
    public Calculator(){

    }

    public int factorial(int number)
    {
        logger.info("[FACTORIAL] - " + number);
        int result = 1;
        for(int i=1;i<=number;i++)
        {
            result = result*i;
        }
        logger.info("[FACTORIAL - RESULT] - " + result);
        return result;
    }

    public double sqrt(double number)
    {
        logger.info("[SQUARE ROOT] - " + number);
        double res = Math.sqrt(number);
        logger.info("[SQUARE ROOT - RESULT] - " + res);
        return  res;
    }

    public double pow(double base, double power)
    {
        logger.info("[POWER] - " + base + "," + power);
        double res = Math.pow(base,power);
        logger.info("[POWER - RESULT] - " + res);
        return  res;
    }

    public double log(double number)
    {
        logger.info("[LOGARITHM] - " + number);
        double res = Math.log(number);
        logger.info("[LOGARITHM] - " + res);
        return res;
    }
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1 to find square root\nPress 2 to find factorial\nPress 3 to find the logarithm\nPress 4 to find the power\nPress any key to exit\n");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            double x,y;
            switch(choice){
                case 1:
                    try{
                        System.out.println("Enter the first number\n");
                        x = sc.nextDouble();
                    }catch (InputMismatchException error){
                        logger.error("Invalid input. The input is not a number");
                        return;
                    }
                    System.out.println("The square root is " + calc.sqrt(x));
                    break;
                case 2:
                    try{
                        System.out.println("Enter the first number\n");
                        x = sc.nextDouble();
                    }catch (InputMismatchException error){
                        logger.error("Invalid input. The input is not a number");
                        return;
                    }
                    System.out.println("The factorial is " + calc.factorial((int)x));
                    break;
                case 3:
                    try{
                        System.out.println("Enter the first number\n");
                        x = sc.nextDouble();
                    }catch (InputMismatchException error){
                        logger.error("Invalid input. The input is not a number");
                        return;
                    }
                    System.out.println("The natural log is " + calc.log(x));
                    break;
                case 4:
                    try{
                        System.out.println("Enter the first number\n");
                        x = sc.nextDouble();
                        System.out.println("Enter the second number\n");
                        y = sc.nextDouble();
                    }catch (InputMismatchException error) {
                        logger.error("Invalid input. The input is not a number");
                        return;
                    }
                    System.out.println("The power is " + calc.pow(x,y));
                    break;
                default:
                    System.out.println("Terminating....\n");
                    return;
            }
        }while(true);
    }
}
