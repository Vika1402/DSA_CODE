public class practice1 {

  public static void main(String[] args) throws Exception {
    int a = 6;
    int b = 0;
    int c = 0;

    try {
      c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("some thing went wrong" + e);
    } finally {
      System.out.println("happy coding !");
    }
    System.out.println("end");
  }
}