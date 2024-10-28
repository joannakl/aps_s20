import java.util.*;
import java.io.*;

public class Modulus22 { 
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int num;
        int sum =0 ; 
        
        while (in.hasNextInt() ) {

          num = in.nextInt(); 

          
          sum = (((num<<12)>>>12 ) + ((sum<<12)>>>12) );  
        }
        
        System.out.println( (sum<<12) >>> 12);

    }
    
}
