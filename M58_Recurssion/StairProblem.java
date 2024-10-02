public class StairProblem {
public static int solve(int n){
  if(n==1 || n==2){
    return n;
  }
  int result=solve(n-1)+solve(n-2);
  return result;
}
  public static void main(String[] args) {
    int n=7;
    System.out.println(solve(n));
    for(int i=1;i<=n;i++){
      System.out.println(solve(i));
    }
  }
}
