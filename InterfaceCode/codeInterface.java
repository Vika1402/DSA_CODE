
interface A{
  int age=12;
  void show();
}
interface B{
  String name="vikas";
}

class C implements A,B{
  
}
public class codeInterface {
  public static void main(String[] args) {
    System.out.println(A.age);
  }
}
