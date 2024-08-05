public class anagram1 {
  public static void main(String[] args) {
    String str="hello vikas";
    String newStr="";
    String arr[]=str.split(" ");
    for(int i=arr.length-1;i>=0;i--){
      newStr=newStr+arr[i]+" ";
    }
    System.out.println(newStr);
  }
}
