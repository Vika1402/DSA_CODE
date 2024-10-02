import java.util.Arrays;

public class Bubble_Sort {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 2, 6, 4, 8, 5 };
    boolean swap = false;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(+arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap = true;
        }
      }
      if (!swap) {
        break;
      }
    }
    System.out.println("");
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]);
    // }
    System.out.println(Arrays.toString(arr));

  }
}
