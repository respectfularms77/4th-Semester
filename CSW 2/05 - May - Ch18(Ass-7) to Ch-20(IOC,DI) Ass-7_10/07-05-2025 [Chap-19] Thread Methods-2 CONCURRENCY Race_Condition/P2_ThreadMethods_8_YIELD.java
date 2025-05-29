public class P2_ThreadMethods_8_YIELD extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" is Running");
		}
	}
	public static void main(String[] args) {
		P2_ThreadMethods_8_YIELD t1 = new P2_ThreadMethods_8_YIELD();
		P2_ThreadMethods_8_YIELD t2 = new P2_ThreadMethods_8_YIELD();
		t1.start();
		t2.start();
	}
}