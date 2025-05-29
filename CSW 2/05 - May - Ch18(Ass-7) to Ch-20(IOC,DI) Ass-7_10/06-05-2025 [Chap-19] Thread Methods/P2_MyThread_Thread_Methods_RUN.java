public class P2_MyThread_Thread_Methods_RUN extends Thread {
	public void run() {
		System.out.println("Run Method is being Executed...");
	}
	public static void main(String[] args) {
		P2_MyThread_Thread_Methods_RUN t1 = new P2_MyThread_Thread_Methods_RUN();
		t1.run();  		// not recommended, runs on the ,main thread
	}
}