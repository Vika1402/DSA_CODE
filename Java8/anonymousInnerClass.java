
interface Car {
  void drive();
}

// class Wagonor implements Car {

// public void drive() {
// System.out.println("Driving..");
// }
// }

public class anonymousInnerClass {
public static void main(String[] args) {
Car obj =()->
  System.out.println("Driving...");
  
obj.drive();
}
}
