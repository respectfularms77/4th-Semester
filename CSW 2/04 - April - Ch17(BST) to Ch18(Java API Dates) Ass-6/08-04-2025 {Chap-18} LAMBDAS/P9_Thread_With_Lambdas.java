public class P9_Thread_With_Lambdas {
	public static void main(String[] args) {
		Runnable task = () -> System.out.println("Thread is running using Lambdas");
		new Thread(task).start();
	}
}