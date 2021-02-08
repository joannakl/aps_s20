import java.util.*;
import java.io.*;

class InputOutput0 {

  public static void main(String [] argc ) throws Exception{
    Scanner in = new Scanner(System.in);


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
        System.out.println("Incorrect format!");
        continue;
      }
      System.out.println(a+b);

    }

  }

}
