import java.util.Scanner;

public class removeDuplicate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String str2 = "";
    for (int i = 0; i < str.length(); i++) {
      boolean isDuplicate = false;
      for (int j=i+1;j<str.length();j++) {
        if (str.charAt(i) == str.charAt(j)) {
          System.out.println(str.charAt(i));
          isDuplicate = true;
          break;
        }
      }
      if (isDuplicate == false) {
        str2 = str2 + str.charAt(i);
      }
    }
    System.out.print(str2);

  }
}
