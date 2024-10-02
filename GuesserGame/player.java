/**
 * player
 */
public class player {

  // apna collage to collage apna
  public static void ans1() {
    String str = "Apna Collage";
    String gtr = "";
    String ptr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      gtr = gtr + str.charAt(i);
    }
    String arr[] = gtr.split(" ");
    for (int i = arr.length - 1; i >= 0; i--) {
      ptr = ptr + arr[i] + " ";
    }
    System.out.println(ptr);
  }

  public static void main(String[] args) {
    ans1();
  }

}