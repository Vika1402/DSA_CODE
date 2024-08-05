import java.util.Scanner;

public class matrixSumByUser {
  public static void main(String[] args) {
    int arr[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
    int m = arr.length;
    int n = arr[0].length;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the r1");
    int r1 = sc.nextInt();
    System.out.println("Enter the c1");
    int c1 = sc.nextInt();
    System.out.println("Enter the r2");
    int r2 = sc.nextInt();
    System.out.println("Enetr the c2");
    int c2 = sc.nextInt();
    for (int i = r1; i < r2; i++) {
      for (int j = c1; j < c2; j++) {
        sum = sum + arr[i][j];
      }
    }
    System.out.println("Sum :" + sum);

  }
}
