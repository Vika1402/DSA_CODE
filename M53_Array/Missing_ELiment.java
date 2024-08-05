
public class Missing_ELiment {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 5, 6, 7 };
    int n = arr.length;
    int sum = (n + 1) * ((n + 1) + 1) / 2;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      ans = ans + arr[i];

    }
  System.out.println(sum-ans);
  }
}
