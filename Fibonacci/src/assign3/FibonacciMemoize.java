package assign3;

import java.util.HashMap;

public class FibonacciMemoize extends FibonacciRecursive
{
    HashMap<Integer, Long> fibonacciMap = new HashMap<Integer, Long>();

    public long computeAt(int position)
    {
        if(!fibonacciMap.containsKey(position))
            fibonacciMap.put(position, super.computeAt(position));

        return fibonacciMap.get(position);
    }
}