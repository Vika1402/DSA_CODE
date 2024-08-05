

/**
 * CreateThread
 */
public class CreateThread {
public static void main(String[] args) {
  int a=12345;
  int sum=0;
  while(a<0){
    int ld=a%10;
    sum=sum+ld;
    a=a/10;
    
  } 
  System.out.println(sum);
}
 
}