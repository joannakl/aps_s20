import java.util.*;

public class ReadInput {

	public static void main (String [] args) {

		Scanner in = new Scanner (System.in) ;

		int x;
		int count = 0;

		while (in.hasNextInt() ) {
			x = in.nextInt();
			count++;

			//do something with x

		}
		System.out.printf("number of lines: %d\n", count);

	}

}
