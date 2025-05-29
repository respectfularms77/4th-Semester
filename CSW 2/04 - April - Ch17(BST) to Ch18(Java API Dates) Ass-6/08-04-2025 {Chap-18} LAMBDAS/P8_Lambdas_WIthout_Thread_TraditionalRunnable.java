public class P8_Lambdas_WIthout_Thread_TraditionalRunnable {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			public void run() {
				System.out.println("Thread is running using Anonymous Class");
			}
		};
		new Thread(task).start();
	}
}