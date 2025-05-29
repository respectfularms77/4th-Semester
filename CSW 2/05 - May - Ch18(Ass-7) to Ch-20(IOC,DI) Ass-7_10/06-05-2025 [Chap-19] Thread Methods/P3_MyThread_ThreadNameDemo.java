public class P3_MyThread_ThreadNameDemo extends Thread{
	public void run() {
		System.out.println("Running Thread: "+getName());
	}
	public static void main(String[] args) {
		P3_MyThread_ThreadNameDemo t1 = new P3_MyThread_ThreadNameDemo();
		t1.setName("MyThread - 1");
		t1.start(); 
	}
}
