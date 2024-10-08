import java.util.Scanner;

public class LowerBound {
  public static int findFirstOccrence(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target){
        result = mid;
        high = mid - 1;
      }
      else if(arr[mid]>target){
        high=mid-1;

      }else{
        low=mid+1;
      }
       
      
    }
    return result;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("engter the size of arr");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

    }
    System.out.println("Enter the target Eliment");
    int target = sc.nextInt();
    int result = findFirstOccrence(arr, target);
    if (result == -1) {
      System.out.println("not present");
    } else {
      System.out.println("present : " + result);
    }
  }
}
