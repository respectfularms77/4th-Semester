public class P1_MyThread_Thread_Methods_START extends Thread{
	public void run() {
		System.out.println("Thread is Running....");
	}
	public static void main(String[] args) {
		P1_MyThread_Thread_Methods_START t1 = new P1_MyThread_Thread_Methods_START();
		t1.start();  		// calls run() indirectly
	}
}