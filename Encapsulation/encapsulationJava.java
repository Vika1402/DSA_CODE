/**
 * encapsulationJava
 */
class Student{
  private int age;
   private String name;

 
 public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age){
this.age=age;
  }

  public int getAge(){
return age;
  }

void show(){
   System.out.println(age+" "+name);
 }
}

public class encapsulationJava {

 

  public static void main(String[] args) {
    
    Student s1=new Student();
    s1.setName("vinay");
    s1.setAge(21);
    s1.show();
 
  }
}