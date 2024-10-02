
public class code {

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }

  }

  public static class linkedlist {
    Node head;
    Node tail;
    int size = 0;

    void insertAtEnd(int val) {
      Node newNode = new Node(val);
      if (head == null) {
        head = tail = newNode;
      }
      tail.next = newNode;
      tail = newNode;
      size++;

    }

    void insertAtstart(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        return;
      } else {
        newNode.next = head;
        head = newNode;
      }
      size++;

    }

    void inserAtIndex(int idx, int data) {
      Node newNode = new Node(data);
      Node temp = head;

      if (idx == 0) {
        insertAtstart(data);
        return;
      }
      if (idx == size - 1) {
        insertAtEnd(data);
      } else {
        for (int i = 1; i <= idx - 1; i++) {
          temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
      }
      size++;

    }

    void deleteAtIndex(int index) {
      Node temp = head;
      if (temp == null) {
        return;
      }

      if (index == 0) {
        temp.next = temp.next.next;
        head = temp;

      } else {
        for (int i = 1; i <= index - 1; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;

      }
      size--;

    }

    void size() {
      System.out.println(size);
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      }

    }
  }

  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.insertAtEnd(1);
    ll.insertAtEnd(3);
    ll.insertAtEnd(5);
    ll.insertAtEnd(7);
    ll.inserAtIndex(4, 21);
    ll.deleteAtIndex(4);
    ll.display();
    System.out.println();
    ll.size();

  }

}