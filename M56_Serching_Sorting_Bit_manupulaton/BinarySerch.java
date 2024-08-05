/**
 * BinarySerch
 */
public class BinarySerch {
  public static int Search(int arr[], int k) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == k) {
        return mid;
      } else if (arr[mid] < k) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int k = 6;
    System.out.println(Search(arr, k));

  }
}