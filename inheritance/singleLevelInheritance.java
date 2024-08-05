
class Animal {
  Animal() {
    System.out.println("animal constructor");
  }

  void sleep() {
    System.out.println("animal need sleep");
  }
}

class Lion extends Animal {

}

public class singleLevelInheritance {

  public static void main(String[] args) {
    Lion l1 = new Lion();
    l1.sleep();
  }
}
