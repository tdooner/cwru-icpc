import java.util.Scanner;

public class Main {
  public static void main(String[] argv) {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int cols = in.nextInt();
    int snowfalls = in.nextInt();

    int[][] rectangleville = new int[rows][cols];

    int startx, starty, endx, endy;
    for (int i=0; i < snowfalls; i++) {
      startx = in.nextInt();
      starty = in.nextInt();
      endx = in.nextInt();
      endy = in.nextInt();
      for (int j=startx; j<=endx; j++) {
        for (int k=starty; k<=endy; k++) {
          rectangleville[j-1][k-1] += 1;
        }
      }
    }
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        System.out.printf("%d",rectangleville[i][j]);
        if (j != cols - 1) {
          System.out.printf(" ");
        } else {
          System.out.printf("\n");
        }
      }
    }
  }
}
