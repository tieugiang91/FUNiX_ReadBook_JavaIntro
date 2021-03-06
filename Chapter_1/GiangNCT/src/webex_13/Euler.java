package webex_13;

// 58. exhaustively searches for all such solutions with a, b, c, d, and e less than or equal to N
// a^5 + b^5 + c^5 + d^5= e^5
public class Euler {

  public static void main(String[] args) {
    //long n = Long.valueOf(args[0]);
    long n = 500;
    long a5, b5, c5, d5, e5;
    String plus = "^5 + ";
    for (long e = 1; e <= n; e++) {
      e5 = e * e * e * e * e;
      for (long a = 1; a <= n; a++) {
        a5 = a * a * a * a * a;
        if (4 * a5 > e5) break;
        for (long b = a; b <= n; b++) {
          b5 = b * b * b * b * b;
          if (a5 + 3 * b5 > e5) break;
          for (long c = b; c <= n; c++) {
            c5 = c * c * c * c * c;
            if (a5 + b5 + c5 + c5 > e5) break;
            for (long d = c; d <= n; d++) {
              d5 = d * d * d * d * d;
              if (a5 + b5 + c5 + d5 > e5) break;
              if (a5 + b5 + c5 + d5 == e5) 
                System.out.println(a + plus + b + plus + c + plus + d + "^5 = " + e + "^5");
            }
          }
        }
      }
    }

  }

}
