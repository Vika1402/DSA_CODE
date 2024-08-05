import java.util.*;

public class code {
  public static void main(String[] args) {

    Map mp = new HashMap<>();
    mp.put(1, "rohan");
    mp.put(2, "sanjay");
    mp.put(3, "shyam");
    mp.put(4, "virat");
    mp.put(5, "ramesh");
    System.out.println(mp);

    Set st = mp.keySet();
    Iterator itr = st.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    Collection value=mp.values();
    Iterator itr2=value.iterator();
  while(itr2.hasNext()){
System.out.println(itr2.next());
  }
  }
}
