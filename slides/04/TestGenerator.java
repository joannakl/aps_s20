import java.util.*;
import java.io.*;

public class TestGenerator {

  public static void main(String [] argc ) throws Exception{
  Random rand = new Random();
  for (int i = 0; i < 1000000;i++) {
    System.out.printf("%d %d\n", rand.nextInt(), rand.nextInt());

  }

  }

}
