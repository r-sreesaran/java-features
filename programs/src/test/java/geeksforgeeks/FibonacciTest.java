package geeksforgeeks;

import geekforgeeks.Fibonacci;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci fib = new Fibonacci();
        fib.printFibbonacci();
        fib.returnNo(80493);
    }
}
