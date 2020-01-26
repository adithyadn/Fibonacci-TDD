package assign3;

public class FibonacciRecursive implements IFibonacci
{
    public long computeAt(int position)
    {
        if (position < 2)
            return 1;

        return computeAt(position - 2) + computeAt(position - 1);
    }
}
