import java.util.TreeSet;

public class TreeSetCode {
  public static void main(String[] args) {
    TreeSet ts =new TreeSet<>();
    ts.add(100);
    ts.add(40);
    ts.add(50);
    ts.add(90);
    ts.add(101);
    ts.add(32);
    System.out.println(ts);
    System.out.println(ts.contains(32));
  }
}
