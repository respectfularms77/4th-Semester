import java.util.*;
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> prQueue=new PriorityQueue<String>();
		prQueue.add("C");
		prQueue.add("Java");
		prQueue.add("Python");
		prQueue.add("C++");
		
		System.out.print("The Head value by using the Peek Funtion is: "+prQueue.peek());
		
		System.out.print("\n\nThe Total Queue Elements are: ");
		Iterator<String> itr1=prQueue.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		
		prQueue.poll();
		System.out.print("\n\nAfter removing an element with poll funtion: ");
		Iterator<String> itr2=prQueue.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		prQueue.remove("Java");
		System.out.print("\n\nAfter removing Java with remove funtion: ");
		Iterator<String> itr3=prQueue.iterator();
		while(itr3.hasNext()) {
			System.out.print(itr3.next()+" ");
		}
		System.out.print("\n\nDoes this priority Queue contains C: "+prQueue.contains("C"));
	}
}