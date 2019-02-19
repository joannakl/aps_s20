import java.util.*;

public class SieveSundaram
{

    private static int top;
    private static int size;
    private static BitSet isPrime;

    public static void main(String[] args)
    {
        top = 30;
        if (args.length > 0)
            top = Integer.parseInt( args[0] ) ;
        if (top <= 3) top = 30;
        calculate( );
        print();
    }

    public static void calculate()
    {

        int counter = 1;
        // this algorithm calculates the sieve only for half
        // of the requested value
        size = (top - 2) / 2;

        isPrime = new BitSet(size);

        // set the index number of the form
        // (i + j + 2ij) as true such that 1<=i<=j
        // this is the main logic of the sieve of sundaram
        for (int i = 1; i <= size; i++)
            for (int j = i; (i + j + 2 * i * j) <= size; j++)
                isPrime.set(i + j + 2 * i * j);


    }

    private static void print()
    {
        //print 2 since the algorith only covers the odd numbers
        if (top > 2)
            System.out.printf("%7d", 2);


        // print the remaining primes
        // this algorithm starts with 1, not 0
        int n = isPrime.nextClearBit( 1 );
        int count = 1;
        while (n <= size)
        {
            System.out.printf("%7d,",(2 * n + 1));

            n = isPrime.nextClearBit(n+1);

            count++;
            if (count %10 == 0 )
                System.out.printf("\n");
        }

        System.out.printf("\n%d primes less than %d\n", count, top);
    }

}
