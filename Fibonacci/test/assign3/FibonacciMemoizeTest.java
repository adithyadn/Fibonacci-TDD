package assign3;

public class FibonacciMemoizeTest extends FibonacciAbstractTest
{
    @Override
    public IFibonacci getFibonacci()
    {
        return new FibonacciMemoize();
    }

    public void testPerformanceEvaluation()
    {
        FibonacciMemoize fibonacciMemoize = new FibonacciMemoize();
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();

        long timeRecursive = System.nanoTime();
        fibonacciRecursive.computeAt(35);
        timeRecursive = System.nanoTime() - timeRecursive;

        long timeMemoize = System.nanoTime();
        fibonacciMemoize.computeAt(35);
        timeMemoize = System.nanoTime() - timeMemoize;

        assertTrue( timeRecursive/timeMemoize >= 10);
    }
}
