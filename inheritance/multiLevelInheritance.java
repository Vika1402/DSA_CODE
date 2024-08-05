 class animal{
  void sleep(){
    System.out.println("need sleep");
  }
 }
 class bear extends animal{
  void eat(){
    System.out.println("need eats");
  }
 }
 class lion extends bear{
  void walk(){
    System.out.println("able to walk");
  }
 }
public class multiLevelInheritance {
  public static void main(String[] args) {
    lion l1=new lion();
    l1.walk();
  }
}
