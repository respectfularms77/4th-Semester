class Counter1{
	private int count=0;
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class P8_Concerrency_RaceSolution_SYNC extends Thread {
	private Counter1 Counter1;
	public P8_Concerrency_RaceSolution_SYNC(Counter1 Counter1) {
		this.Counter1 = Counter1;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			Counter1.increment();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Counter1 Counter1 = new Counter1();
		Thread t1 = new P8_Concerrency_RaceSolution_SYNC(Counter1);
		Thread t2 = new P8_Concerrency_RaceSolution_SYNC(Counter1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final Count: "+Counter1.getCount());
	}
}