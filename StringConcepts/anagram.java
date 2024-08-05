import java.util.Arrays;

public class anagram {
  public static void main(String[] args) {
    String str1 = "School master";
    String str2 = "the classroom3";
    // remove space with replace method
    str1 = str1.replace(" ", "");
    str2 = str2.replace(" ", "");
    // convert lower case
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    // convert charcater arrays of string
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();
    // sort and compare
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    // compare both array with their asscai value
    if (Arrays.equals(arr1, arr2)) {
      System.out.println("Anagramm hai");
    } else {
      System.out.println("Anagram nahi hai");
    }

  }
}
