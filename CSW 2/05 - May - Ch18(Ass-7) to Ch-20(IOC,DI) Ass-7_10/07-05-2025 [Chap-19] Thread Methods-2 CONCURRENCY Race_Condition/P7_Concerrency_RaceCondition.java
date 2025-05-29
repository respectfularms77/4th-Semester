class Counter{
	private int count=0;
	public void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class P7_Concerrency_RaceCondition extends Thread {
	private Counter counter;
	public P7_Concerrency_RaceCondition(Counter counter) {
		this.counter = counter;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t1 = new P7_Concerrency_RaceCondition(counter);
		Thread t2 = new P7_Concerrency_RaceCondition(counter);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final Count: "+counter.getCount());
	}
}