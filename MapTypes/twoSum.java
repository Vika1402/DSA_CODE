import java.util.HashMap;

/**
 * twoSum
 */
public class twoSum {
  static HashMap<Character, Integer> makeFreq(String str) {
    HashMap<Character, Integer> mp = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      Character ch = str.charAt(i);
      if (!mp.containsKey(ch)) {
        mp.put(ch, 1);
      } else {
        int currFreq = mp.get(ch);
        mp.put(ch, currFreq + 1);
      }

    }
    return mp;

  }

  public static boolean Anagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    HashMap<Character, Integer> mp1 = makeFreq(s1);
    HashMap<Character, Integer> mp2 = makeFreq(s2);
    return mp1.equals(mp2);
  }

  public static boolean Anagram2(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    HashMap<Character, Integer> mp = makeFreq(s1);

    for (int i = 0; i < s2.length(); i++) {
      Character ch = s2.charAt(i);
      if (!mp.containsKey(ch)) {
        return false;
      }
      int curr = mp.get(ch);
      mp.put(ch, curr - 1);
      if (curr == 0) {
        break;
      }

    }
    // all values in map shoud be zero
    for (Integer i : mp.values()) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }

  public boolean isomorphic(String s, String t) {
  
  }

  public static void main(String[] args) {

    System.out.println(Anagram2("amar", "mara"));
  }
}
