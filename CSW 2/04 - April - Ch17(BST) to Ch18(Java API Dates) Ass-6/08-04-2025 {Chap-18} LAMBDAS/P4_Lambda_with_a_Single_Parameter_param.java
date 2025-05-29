public class P4_Lambda_with_a_Single_Parameter_param {
	interface Announcement {
		String announce(String message);
	}
	public static void main(String[] args) {
		Announcement a1 = (msg) -> "Announcement: "+msg;
		System.out.println(a1.announce("Flight to NY is cancelled"));
		Announcement a2 = (msg) -> "Alert: "+msg;
		System.out.println(a2.announce("Flight to Boston is cancelled"));
	}
}