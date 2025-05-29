public class P4_PriorityDemo extends Thread {
	public void run() {
		System.out.println("Name: "+getName() + " with Priority: " + getPriority());
	}
	public static void main(String[] args) {
		P4_PriorityDemo t1 = new P4_PriorityDemo();
		P4_PriorityDemo t2 = new P4_PriorityDemo();
		P4_PriorityDemo t3 = new P4_PriorityDemo();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}