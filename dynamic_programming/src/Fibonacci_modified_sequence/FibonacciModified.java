package Fibonacci_modified_sequence;

import java.math.BigInteger;

public class FibonacciModified {

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger[] t = new BigInteger[n + 1];
        t[0] = BigInteger.valueOf(t1);
        t[1] = BigInteger.valueOf(t2);
        for(int i = 2; i <= n; i++) {
            t[i] = t[i - 2].add(t[i - 1].multiply(t[i - 1]));
        }
        return t[n - 1];
    }
}
