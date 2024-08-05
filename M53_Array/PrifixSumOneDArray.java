import java.util.Scanner;

public class PrifixSumOneDArray {

  public static void prefixSum(int arr[][]) {
    // find row wise prefix sum
    int m = arr.length;
    int n = arr[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] += arr[i][j - 1];

      }
    }

    for (int j = 0; j < n; j++) {
      for (int i = 1; i < m; i++) {
        arr[i][j] += arr[i - 1][j];
      }
    }

  }

  public static int sumRegion(int arr[][], int r1, int c1, int r2, int c2) {

    int sum = 0, up = 0, left = 0, repeated_region = 0;
    sum = arr[r2][c2];
    up = arr[r1 - 1][c2];
    left = arr[r2][c1 - 1];
    repeated_region = arr[r1 - 1][c1 - 1];
    int result = sum - up - left + repeated_region;
    return result;
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the r1");
    int r1 = sc.nextInt();
    System.out.println("Enter the c1");
    int c1 = sc.nextInt();
    System.out.println("Enter the r2");
    int r2 = sc.nextInt();
    System.out.println("Enetr the c2");
    int c2 = sc.nextInt();
    prefixSum(arr);
    int result = sumRegion(arr, r1, c1, r2, c2);
    System.out.println(result);

  }
}
