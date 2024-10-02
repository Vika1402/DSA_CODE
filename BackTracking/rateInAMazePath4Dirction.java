public class rateInAMazePath4Dirction {
  public static void main(String[] args) {
    int rows = 3;
    int cols = 3;
    boolean isVisited[][] = new boolean[rows][cols];
    maze(0, 0, rows-1, cols-1, "", isVisited);

  }

  public static void maze(int sr, int sc, int er, int ec, String str, boolean[][] isVisited) {
    if (sr < 0 || sc < 0) {
      return;
    }
    if (sr > er || sc > ec)
      return;
    if (isVisited[sr][sc] == true)
      return;
    if (sr == er && sc == ec) {
      System.out.println(str);
      return;
    }

    isVisited[sr][sc] = true;
    // go right
    maze(sr, sc + 1, er, ec, str + "R", isVisited);
    // go down
    maze(sr + 1, sc, er, ec, str + "D", isVisited);
    // go left
    maze(sr, sc - 1, er, ec, str + "L", isVisited);
    // go up
    maze(sr - 1, sc, er, ec, str + "U", isVisited);
    
    isVisited[sr][sc] = false;
  }

}
