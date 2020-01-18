import java.util.*;
import java.io.*;

public class InputOutput1 {

  public static void main(String [] argc ) throws Exception{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int a, b;
    String str = null;
    String [] vals;

    do {

      str = br.readLine();
      if (str == null) break;
      vals = str.split(" ") ;

      try {
        a = Integer.parseInt(vals[0]);
        b = Integer.parseInt(vals[1]);
      } catch (NumberFormatException nfe) {
        System.out.println("Incorrect format!");
        continue;
      }
      System.out.println(a+b);

    } while (str != null);

  }

}
