package com.anhvt.chapter1_3.reading;

public class Prime {
    public static void main(String[] args) {
        prime(81);
        prime(17);
    }

    public static void prime(long n) {
        boolean isPrime = true;
        if (n < 2) isPrime = false;

        // try all possible factors of n
        // if if n has a factor, then it has one less than or equal to sqrt(n),
        // so for efficiency we only need to check factor <= sqrt(n) or
        // equivalently factor*factor <= n
        for (long factor = 2; factor*factor <= n; factor++) {

            // if factor divides evenly into n, n is not prime, so break out of loop
            if (n % factor == 0) {
                isPrime = false;
                break;
            }
        }

        // print out whether n is prime
        if (isPrime) System.out.println(n + " is prime");
        else         System.out.println(n + " is not prime");
    }
}
