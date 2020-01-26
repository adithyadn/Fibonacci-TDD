package assign3;

import junit.framework.TestCase;

public abstract class FibonacciAbstractTest extends TestCase
{
    private IFibonacci fibonacci;

    public abstract IFibonacci getFibonacci();

    public void setUp()
    {
        fibonacci = getFibonacci();
    }

    public void testCanary()
    {
        assertTrue(true);
    }

    public void testFibonacciNumberAtPositionZero()
    {
        assertEquals( 1, fibonacci.computeAt(0));
    }

    public void testFibonacciNumberAtPositionOne()
    {
        assertEquals( 1, fibonacci.computeAt(1));
    }

    public void testFibonacciNumberAtPositionTwo()
    {
        assertEquals( 2, fibonacci.computeAt(2));
    }

    public void testFibonacciNumberAtPositionThree()
    {
        assertEquals( 3, fibonacci.computeAt(3));
    }

    public void testFibonacciNumberAtPositionFour()
    {
        assertEquals( 5, fibonacci.computeAt(4));
    }

    public void testFibonacciNumberAtNegativePosition()
    {
        assertEquals(1, fibonacci.computeAt(-2));
    }
}
