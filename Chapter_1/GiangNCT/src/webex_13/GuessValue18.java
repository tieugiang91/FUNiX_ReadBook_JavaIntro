package webex_13;

// 28. Choose the correct answer from 0, 100, 101, 517, or 1000.
public class GuessValue18 {

  public static void main(String[] args) {
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          if (2 * i + j >= 3 * k) {
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt); // 517
  }

}
