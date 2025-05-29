public class P6_ThreadMethods_IsAliveDemo extends Thread {
	public void run() {
		System.out.println(getName()+ " is Running....");
	}
	public static void main(String[] args) {
		P6_ThreadMethods_IsAliveDemo t1 = new P6_ThreadMethods_IsAliveDemo();
		P6_ThreadMethods_IsAliveDemo t2 = new P6_ThreadMethods_IsAliveDemo();
		System.out.println("Before Start T1: "+t1.isAlive());
		t1.start();
		System.out.println("After Start T1: "+t1.isAlive());
		System.out.println("Before Start T2: "+t2.isAlive());
		t2.start();
		System.out.println("After Start T2: "+t2.isAlive());
	}
}
