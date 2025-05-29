public class P5_ThreadMethods_JOINEXAMPLE extends Thread{
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println(getName()+" is running");
		}
	}
	public static void main(String[] args) {
		P5_ThreadMethods_JOINEXAMPLE t1 = new P5_ThreadMethods_JOINEXAMPLE();
		P5_ThreadMethods_JOINEXAMPLE t2 = new P5_ThreadMethods_JOINEXAMPLE();
		P5_ThreadMethods_JOINEXAMPLE t3 = new P5_ThreadMethods_JOINEXAMPLE();
		t1.start();
		try {
			t1.join(1000);			//Waits until t1 finishes
		}catch(InterruptedException e) {
			System.out.println("Problem Arises in Thread 1");
		}
		t2.start();
		t3.start();
	}
}