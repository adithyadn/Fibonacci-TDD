package assign3;

public class FibonacciIterativeTest extends FibonacciAbstractTest
{
    @Override
    public IFibonacci getFibonacci()
    {
        return new FibonacciIterative();
    }
}

