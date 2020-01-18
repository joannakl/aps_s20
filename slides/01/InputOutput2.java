import java.util.*;
import java.io.*;

public class InputOutput2 {

  public static void main(String [] argc ) throws Exception{
    Scanner in = new Scanner(System.in);
    BufferedWriter out = new BufferedWriter(
              new OutputStreamWriter(System.out));

    int a, b;
    String str = null;
    String [] vals;

    while (in.hasNextLine() ) {

      str = in.nextLine();
      vals = str.split(" ") ;

      try {
        a = Integer.parseInt(vals[0]);
        b = Integer.parseInt(vals[1]);
      } catch (NumberFormatException nfe) {
        out.write("Incorrect format!\n");
        continue;
      }
      out.write(a+b+"\n");

    }
    out.flush();
  }

}
