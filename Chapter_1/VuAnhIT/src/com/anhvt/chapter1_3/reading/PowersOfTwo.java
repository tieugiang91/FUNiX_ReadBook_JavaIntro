package com.anhvt.chapter1_3.reading;
/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo n
 *
 *  This program takes a command-line argument n and prints a table of
 *  the powers of 2 that are less than or equal to 2^n.
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  Remarks
 *  ------------
 *  Only works if 0 <= n < 31 since 2^31 overflows an int.
 *
 ******************************************************************************/
public class PowersOfTwo {
    public static void main(String[] args) {
        powersOfTwo(5);
    }

    // read in one command-line argument
    private static void powersOfTwo(int n) {
        int i = 0;
        int powerOfTwo = 1;

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
    }

}
