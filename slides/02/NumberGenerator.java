import java.util.*;
import java.io.*;

public class NumberGenerator { 
    
    public static void main (String [] args){
        Random rand = new Random( ); 
        
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt(); ;
        StringBuilder output = new StringBuilder(); 
        
        while ( num-- > 0 ) {
          int i = rand.nextInt(); 
          
          output.append( ( i<0 ? -i : i ) % 1000000000 + "\n"); 

           
        }
        
        System.out.println(output);

    }
    
}
