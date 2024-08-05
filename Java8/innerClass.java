class A {

  public void show() {
    System.out.println("in show");
  }

  class B {
    public void disp() {
      System.out.println("in display");
    }
  }
}

public class innerClass {
  public static void main(String[] args) {
    A obj = new A();
    A.B obj1 = obj.new B();
    obj.show();
obj1.disp();
  }

}
