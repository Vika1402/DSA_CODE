import java.util.*;

class MapType {
  public static void main(String[] args) {
    Map<Integer, String> hm = new HashMap<>();
    hm.put(3, "One");
    hm.put(2, "Two");
    hm.put(5, "Three");
    hm.put(4, "Four");
    System.out.println(hm);
    Map<Integer, String> tm = new TreeMap<>();
    tm.put(1, "One");
    tm.put(2, "Two");
    tm.put(6, "Three");
    tm.put(4, "Four");
    System.out.println(tm);

  }
}