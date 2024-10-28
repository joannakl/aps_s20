import java.util.*;
import java.io.*;

class InputOutput4 {

  public static void main(String [] argc ) throws Exception{
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder(); 

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
      
      output.append((a+b) + "\n" ); 
    }
    
    System.out.println(output);


  }

}
