package assign3;

public class FibonacciIterative implements IFibonacci
{
    public long computeAt(int position)
    {
        int fibonacciNumber = 1, previousNumber = 1;

        for(int i = 2; i <= position; i++)
        {
            int secondPrevious = previousNumber;
            previousNumber = fibonacciNumber;
            fibonacciNumber = previousNumber + secondPrevious;
        }
        return fibonacciNumber;
    }
}
