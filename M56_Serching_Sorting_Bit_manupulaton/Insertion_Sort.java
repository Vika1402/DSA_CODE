import java.util.Arrays;

public class Insertion_Sort {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 8, 1, 6, 7, 9, 3 };

    for (int i = 1; i < arr.length; i++) {
      int j=i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
        

      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
