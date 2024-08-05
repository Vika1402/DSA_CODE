import java.util.ArrayList;
import java.util.Iterator;

public class codepract {
  public static void main(String[] args) {
    
    ArrayList al=new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(5);
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
System.out.println("......");
    for(Object o:al){
      System.out.println(o);
      Iterator itr=al.iterator();
     while(itr.hasNext()){
      
     }
    }
  }
}
