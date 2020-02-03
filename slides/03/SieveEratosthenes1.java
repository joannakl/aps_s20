import java.util.*;

public class SieveEratosthenes1
{
    private static int top;
    private static BitSet isPrime;

    public static void main(String[] args)
    {
        top = 30;
        if (args.length > 0)
            top = Integer.parseInt( args[0] ) ;
        isPrime = new BitSet(top);
        System.out.printf("Finding primes smaller than %d\n", top);
        calculate( );
        print();
    }

    private static void calculate( )
    {
        //set all values from 2 to top to true
        //these are potential primes
        isPrime.set(2, top);

        int n = isPrime.nextSetBit( 2 );
        while( n*n < top)
        {
            //eliminate multiples of n
            for (int m = 2; m*n < top; m++)
            {
                isPrime.clear(m*n);
            }
            //get the next prime
            n = isPrime.nextSetBit(n+1);
        }
    }
    private static void print()
    {
        int n = isPrime.nextSetBit( 0 );
        int count = 0;
        while( n != -1) {

            System.out.printf("%7d,", n);

            n = isPrime.nextSetBit(n+1);

            count++;
            if (count %10 == 0 )
                System.out.printf("\n");
        }

        System.out.printf("%n%d primes less than %d%n", count, top);
    }
}
