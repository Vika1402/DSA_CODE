public class reverseString {
  public static void main(String[] args) {

    // String str="India";//AIDNI
    // String newString="";
    // for(int i=str.length()-1;i>=0;i--){
    // newString=newString+str.charAt(i);
    // }
    // System.out.println(newString.toUpperCase());

    // String str="Hello Vikas";
    // String str2="";
    // String arr[]=str.split(" ");
    // for(int i=arr.length-1;i>=0;i--){
    // str2=str2+arr[i]+" ";
    // }
    // System.out.println(str2);

    // String str="hello world";//world hello
    // String str1="";
    // String arr[]=str.split(" ");
    // for(int i=arr.length-1;i>=0;i--){
    // str1= str1+arr[i]+" ";
    // }
    // System.out.println(str1);

    String str = "apna collage";
    String gtr = "";
    String ptr="";
    for (int i = str.length() - 1; i >= 0; i--) {
      gtr = gtr + str.charAt(i);
    }
    String arr[]=gtr.split(" ");

    for(int i=arr.length-1;i>=0;i--){
      ptr=ptr+arr[i]+" ";
    }
    System.out.println(ptr);
  }
}
