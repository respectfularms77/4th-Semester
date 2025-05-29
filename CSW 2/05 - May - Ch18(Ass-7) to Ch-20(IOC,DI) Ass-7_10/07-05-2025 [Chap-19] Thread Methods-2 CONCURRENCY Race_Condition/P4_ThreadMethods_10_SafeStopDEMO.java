public class P4_ThreadMethods_10_SafeStopDEMO extends Thread{
	volatile boolean running = true;
	public void run() {
		while(running) {
			System.out.println("Thread Running");
		}
		System.out.println("Thread Stopped Safely.");
	}
	public static void main(String[] args) throws InterruptedException{
		P4_ThreadMethods_10_SafeStopDEMO t1=new P4_ThreadMethods_10_SafeStopDEMO();
		t1.start();
		Thread.sleep(1);
		t1.running=false;
	}
}