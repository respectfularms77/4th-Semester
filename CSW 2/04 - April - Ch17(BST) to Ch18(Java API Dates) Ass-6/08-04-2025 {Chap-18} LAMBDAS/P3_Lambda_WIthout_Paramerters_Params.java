public class P3_Lambda_WIthout_Paramerters_Params {
	interface Announcement {
		String announce();
	}
	public static void main(String[] args) {
		Announcement a = () -> "The Flight to New York is cancelled due to Weather";
		System.out.println(a.announce());
	}
}