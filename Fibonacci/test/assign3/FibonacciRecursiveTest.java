package assign3;

public class FibonacciRecursiveTest extends FibonacciAbstractTest
{
    @Override
    public IFibonacci getFibonacci()
    {
        return new FibonacciRecursive();
    }
}

