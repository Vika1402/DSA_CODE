/**
 * staticBasic
 */
public class staticBasic {

  static int age;
  static{
    age=20;
    System.out.println(age);
  }
  static void display(){
    System.out.println("static function hai");
  }
  public static void main(String[] args) {
    System.out.println("hello");
    display();
  }
}