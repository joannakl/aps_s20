import java.util.*;
import java.io.*;
import java.math.*;

public class Modulus11 { 
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        
        String num;
        BigInteger sum = new BigInteger("0") ; 
        
        while (in.hasNext() ) {

          num = in.next(); 

          
          sum = sum.add( new BigInteger( num ) ); 
        }
        
        System.out.println(sum.mod( new BigInteger("1048576") ) );

    }
    
}
