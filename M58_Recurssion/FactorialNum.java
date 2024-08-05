
public class FactorialNum {
  public static int fact(int n) {

    if (n == 0 || n == 1) {
      return 1;
    }

    int result = n * fact(n - 1);
    return result;

  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(5));
  }
}
