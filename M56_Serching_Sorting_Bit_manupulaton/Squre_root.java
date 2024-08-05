import java.util.Scanner;

public class Squre_root {
  public static int SqureRoot(int num) {
    int low = 0;
    int high = num;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      long val = mid * mid;
      if (val == num) {
        return mid;
      }
      else if(val<num){
        result=mid;
        low=mid+1;

      }
      else{
        high=mid-1;
      }
    }
return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int num=sc.nextInt();
    int result = SqureRoot(num);
    System.out.println("squre root given number is " + result);
  }
}
