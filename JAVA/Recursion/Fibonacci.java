package Recursion;

import java.time.Duration;
import java.time.LocalDateTime;

public class Fibonacci {
    // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

// For example: fibonacciRecursive(6) should return 8

    static long num = 0;

    public static long fibonacciRecursively(long n) { //O(2^n)
        if (n < 2) {
            return n;
        }
        return fibonacciRecursively(n - 1) + fibonacciRecursively(n - 2);
    }

    static long fibonacciRecursivelyEfficient(long n, long val, long prev) { //O(n)
        if (n == 0) {
            return prev;
        }
        if (n == 1) {
            return val;
        }
        return fibonacciRecursivelyEfficient(n - 1, val + prev, val);
    }

    public static long fibonacciIteratively(long n) { //O(n)
        if (n == 0) {
            return 0;
        }
        long result     = 1;
        long lastNumber = 0;
        long temp;
        for (long i = 1; i < n; i++) {
            temp       = result;
            result += lastNumber;
            lastNumber = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        num = 0;

        LocalDateTime startTime;
        LocalDateTime endTime;

        System.out.println("Iterative");
        startTime = LocalDateTime.now();
        System.out.println(fibonacciIteratively(100));
        endTime = LocalDateTime.now();

        System.out.println(" time =  " + Duration.between(startTime, endTime).toMillis());

        System.out.println("Recursive Efficient");
        startTime = LocalDateTime.now();
        System.out.println(fibonacciRecursivelyEfficient(100, 1, 0));
        endTime = LocalDateTime.now();
        System.out.println(" time =  " + Duration.between(startTime, endTime).toMillis());

        System.out.println("Recursive");
        startTime = LocalDateTime.now();
        System.out.println(fibonacciRecursively(100));
        endTime = LocalDateTime.now();
        System.out.println(" time =  " + Duration.between(startTime, endTime).toMillis());
    }

}
