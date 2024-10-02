import java.util.Scanner;

class Power{
  public static long powerAns(int a, int b) {
    if (b == 1) {
      return a;
    }
    long ans = powerAns(a, b / 2);
  long finalAns = ans * ans;
    if (b % 2 != 0) {
      finalAns = a * finalAns;
    }
    return finalAns;
  }
}
public class PowOptimizeCode {
  

  public static void main(String[] args) {
    Power p=new Power();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();
    System.out.println("Ans is :" + p.powerAns(a, b));

  }
}
