public class PowerCode {
  public static int power(int a, int b) {
    if (b == 1) {
      return a;
    }
    int result = a * power(a, b - 1);
    return result;

  }

  public static void main(String[] args) {
    int a = 2;
    int b = 4;
    System.out.println(power(a, b));
    System.out.println((int) Math.pow(3, 4));
  }
}
