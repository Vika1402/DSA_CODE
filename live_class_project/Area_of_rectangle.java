import java.util.*;

class recatangle {

  float length;
  float width;
  float area;

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

  public void disp() {
    System.out.println("Area of ractangle is: " + area);

  }
}

class squre {

  float length;

  float area;

  public void input() {
    System.out.println("calculation of recatangle");
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the length of rectangle");
    length = sc.nextFloat();

  }

  public void compute() {
    area = length * length;
  }

  public void disp() {
    System.out.println("Area of ractangle is :" + area);

  }
}

class circle {

  float radius;

  float area;

  public void input() {
    System.out.println("calculation of recatangle");
    Scanner sc = new Scanner(System.in);
    System.out.println("plese enter the length of rectangle");
    radius = sc.nextFloat();

  }

  public void compute() {
    area = 3.14f * radius * radius;
  }

  public void disp() {
    System.out.println("Area of ractangle is : " + area);

  }
}

public class Area_of_rectangle {

  public static void main(String[] args) {

    recatangle rc = new recatangle();
    rc.input();
    rc.compute();
    rc.disp();
    squre sq = new squre();
    sq.input();
    sq.compute();
    sq.disp();
    circle c = new circle();
    c.input();
    c.compute();
    c.disp();
  }
}