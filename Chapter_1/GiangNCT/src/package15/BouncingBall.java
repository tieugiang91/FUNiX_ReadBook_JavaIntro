package package15;

import lib.StdDraw;

public class BouncingBall {

  public static void main(String[] args) {
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    StdDraw.enableDoubleBuffering();
    
    double rx = 0.48, ry = 0.86;
    double vx = 0.015, vy = 0.023;
    double radius = 0.05;
    
    while (true) {
      if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
      if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
      
      rx = rx + vx;
      ry = ry + vy;
      
      StdDraw.clear(StdDraw.WHITE);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(rx, ry, radius);
      StdDraw.show();
      StdDraw.pause(20);
    }
  }

}
