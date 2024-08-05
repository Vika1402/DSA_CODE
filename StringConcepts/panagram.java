/**
 * panagram
 */
public class panagram {

  public static void main(String[] args) {
    boolean flag = false;
    String str = "The quick brown fox jumps over the lazy doG";

    str = str.replace(" ", "");
    str = str.toUpperCase();
    char[] ch = str.toCharArray();
    int arr[] = new int[26];

    for (int i = 0; i < ch.length; i++) {
      arr[ch[i] - 'A']++;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        System.out.println("this string is not panagram");
        flag = true;
        break;
      }
    }
    if (flag == false) {
      System.out.println("panagram hai ");
    }

  }
}