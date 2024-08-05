interface A {
  void show();
}
interface X{
  void abc();
}
class B implements A,X {

  public void show() {
    System.out.println("show method");
  }
  public void abc(){
    System.out.println("interface 2 called by ");
  }

  // public void show(int a, int b) {
  //   System.out.println(a + b);
  // }
}


public class demo {

  public static void main(String[] args) {
    B obj = new B();
    obj.show();
    obj.abc();
  }
}
