public class P3_ThreadMethods_9_INTERRUPT extends Thread {
	public void run() {
		try {
			Thread.sleep(1500);
			System.out.println(Thread.currentThread().getName()+" Completed");
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+" was Interrupted ");
		}
	}
	public static void main(String[] args) {
		P3_ThreadMethods_9_INTERRUPT t1 = new P3_ThreadMethods_9_INTERRUPT();
		t1.start();
		
		P3_ThreadMethods_9_INTERRUPT t2 = new P3_ThreadMethods_9_INTERRUPT();
		t2.start();
		
		t2.interrupt();
	}
}