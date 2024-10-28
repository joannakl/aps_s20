import java.util.*;
import java.io.*;

public class Modulus { 
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int num;
        int sum =0 ; 
        
        while (in.hasNextInt() ) {

          num = in.nextInt(); 

          
          sum += num;  
        }
        
        System.out.println(sum % 1000000);

    }
    
}
