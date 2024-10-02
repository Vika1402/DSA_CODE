public class mazeRateString {
  public static void main(String[] args) {
    int rows = 4;
    int cols = 6;
    maze(1, 1, rows, cols, "");

  }

  public static void maze(int sr, int sc, int er, int ec, String str) {
    if (sr > er || sc > ec)
      return;
    if (sr == er && sc == ec) {
      System.out.println(str);
      return;
    }
    // go right
    maze(sr, sc + 1, er, ec, str + "R");
    // go down
    maze(sr + 1, sc, er, ec, str + "D");

  }
}
