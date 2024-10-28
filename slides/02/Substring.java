
public class Substring {

  public static void main(String [] argc ) {
      String X = "abcdaaaabbbbcddd";

      System.out.println( substringMatch(X, "ab"));
      System.out.println( substringMatch(X, "abab"));

  }

  public static boolean substringMatch ( String X, String Y ) {
    for (int i = 0; i < X.length(); i++ ) {
      boolean matched = true;
      for (int j = 0; j < Y.length(); j++) {
        if (i+j >= X.length()) {
          matched = false;
          break;
        }
        if ( X.charAt(i+j) != Y.charAt(j) ) {
          matched = false;
          break;
        }
      }
      if (matched) return true;
    }
    return false;
  }
}
