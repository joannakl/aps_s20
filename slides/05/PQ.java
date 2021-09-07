import java.util.PriorityQueue ;
import java.util.Comparator;

public class PQ {

	public static void main (String [] args) {

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comp());
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(2);
		System.out.println( q.peek() ); // 7
		q.remove();
		System.out.println( q.peek() );  // 5
		q.remove();
		q.add(6);
		System.out.println( q.peek() ); // 6
		q.remove();

	}

}

class Comp implements Comparator<Integer>{
	public int compare (Integer a, Integer b) {
		return b-a;
	}
}
