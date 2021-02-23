public class Calculator {

    public int factorial(int number)
    {
        int result = 1;
        for(int i=1;i<=number;i++)
        {
            result = result*i;
        }
        return result;
    }
}
