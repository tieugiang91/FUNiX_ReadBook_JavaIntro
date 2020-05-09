package com.anhvt.chapter1_3.reading;
/******************************************************************************
 *  Compilation:  javac RulerN.java
 *  Execution:    java RulerN n
 *
 *  Prints the relative lengths of the subdivisions on a ruler or
 *  order n.
 *
 *  % java RulerN 3
 *   1
 *   1 2 1
 *   1 2 1 3 1 2 1
 *
 *  % java RulerN 5
 *   1
 *   1 2 1
 *   1 2 1 3 1 2 1
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 *
 *
 *  % java RulerN 100
 *  a lot of output, then
 *  Exception in thread "main" java.lang.OutOfMemoryError
 *
 ******************************************************************************/
public class RulerN {
    public static void main(String[] args) {
        rulerN(3);
        rulerN(5);
    }

    public static void rulerN(int n) {
        // ruler of order 0
        String ruler = " ";

        // repeat n times
        for (int i = 1; i <= n; i++) {

            // concatenate a ruler of order 0, the number i, and a ruler of order 0
            ruler = ruler + i + ruler;

            // print out the final result
            System.out.println(ruler);
        }
    }
}
