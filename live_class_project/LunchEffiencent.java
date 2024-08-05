import java.util.*;

abstract class shap {
  float area;

  abstract public void input();

  abstract public void compute();

  public void disp() {
    System.out.println("The area is : " + area);
  }
}

class recatangle1 extends shap {

  float length;
  float width;

  public void input() {
    System.out.println("calculation of recatangle");
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the length of rectangle");
    length = sc.nextFloat();
    System.out.println("plese enter the width of rectangle");
    width = sc.nextFloat();

  }

  public void compute() {
    area = length * width;
  }

}

class squre1 extends shap {

  float length;

  public void input() {
    System.out.println("calculation of squre");
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the length of squre");
    length = sc.nextFloat();

  }

  public void compute() {
    area = length * length;
  }

}

class circle1 extends shap {

  float radius;

  public void input() {
    System.out.println("calculation of circle");
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the length of circle");
    radius = sc.nextFloat();

  }

  public void compute() {
    area = 3.14f * radius * radius;
  }

}


// reference class by accessing shap class functions

class Geometry {
  public void poly(shap ref) {
    ref.input();
    ref.compute();
    ref.disp();
  }
}

public class LunchEffiencent {
  public static void main(String[] args) {

    recatangle1 rec = new recatangle1();
    squre1 sq = new squre1();
    circle1 cl = new circle1();
    Geometry g = new Geometry();
    g.poly(rec);
    g.poly(sq);
    g.poly(cl);

  }
}
