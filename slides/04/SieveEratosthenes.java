import java.util.*;

public class SieveEratosthenes
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
        for (int i = 2; i < top; i++)
        {
            isPrime.set(i);
        }
        for (int n = 2; 2*n < top; n++)
        {
            if (isPrime.get(n))
            {
                for (int m = n; m*n < top; m++)
                {
                    isPrime.clear(m*n);
                }
            }
        }
    }
    private static void print()
    {
        int n=0;
        for (int i = 0; i < top; i++)
        {
            if (isPrime.get(i))
            {
                System.out.printf("%7d,", i);
                n++;
                if (n %10 == 0 )
                    System.out.printf("\n");
            }
        }
        System.out.printf("%n%d primes less than %d%n", n, top);
    }
}
