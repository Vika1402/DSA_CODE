/**
 * codePoly
 */
class Car{
  public void tair(){
    System.out.println("Four tier in car ");
  }
   public void speed(){
    System.out.println("Car speed dipend upon thier engine power");
  }
}
class toyota extends Car{
  public void tair(){
    System.out.println("toyota 4 whiller car");
  }
}


public class codePoly {
  public static void main(String[] args) {
    toyota t1=new toyota();
    t1.speed();
    t1.tair();
    
  }
}


  
