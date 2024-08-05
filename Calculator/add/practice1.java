import java.util.Scanner;

public class practice1 {

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("plese give a number A");
      int A = sc.nextInt();
      System.out.println("plese give me second number");
      int B = sc.nextInt();
      int result = A + B;
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("something went wrong");
    }
    System.out.println(run());
  }
}
