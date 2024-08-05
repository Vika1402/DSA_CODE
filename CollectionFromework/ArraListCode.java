//package CollectionFromework;

import java.util.*;

public class ArraListCode {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(100);
    al.add(200);
    al.add(300);
    al.add(400);

    System.out.println("more function of ArrayList");
    System.out.println(al.contains(200));
    System.out.println(al.indexOf(200));
    System.out.println(al.size());
    al.ensureCapacity(10);
    al.trimToSize();
    System.out.println(al.size());
    al.clear();
    System.out.println(al);
    System.out.println(al.size());

    List al2 = new ArrayList();// List is polymorphism as a arralist refernce
    al2.add(989);
    System.out.println(al2);

    System.out.println(al2);
    // ArrayList al1 = new ArrayList<>();
    // al1.add("pw skills");
    // al1.add(200);
    // al1.add("java");
    // al1.add("code karo");
    // System.out.println(al1);
    // al1.add(300);
    // System.out.println(al1);

    // ArrayList al3=new ArrayList<>();
    // al3.add(23);
    // System.out.println(al3);
    // al3.addAll(al);
    // System.out.println(al3);
    // al3.add(1,"vikas");
    // System.out.println(al3);

  }
}
