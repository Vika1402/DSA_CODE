import java.util.Arrays;

public class twosumArray {

  public static int[] ans(int arr[], int k) {
    int a[] = { -1 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == k) {
          a = new int[] { i, j };
          return a;
        }
      }
    }
    return a;

  }

  public static void main(String[] args) {
    int arr[] = { 1,5,7,-1};

    int k = 6;

    int a[] = ans(arr, k);
    System.out.println(Arrays.toString(a));

  }
}
