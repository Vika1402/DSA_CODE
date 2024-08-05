
import java.util.LinkedList;

public class LinkedListCollection {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList<>();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    System.out.println(ll);
    ll.addFirst("hello");
    System.out.println(ll);
    ll.add(2, "99");
    System.out.println(ll);
    System.out.println(ll.peek());
    System.out.println(ll.get(2));
    System.out.println(ll.indexOf(30));
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
    ll.push(21);
   
    System.out.println(ll);

  }
}
