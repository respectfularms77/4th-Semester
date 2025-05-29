public class P6_Lambda_With_Return {
	interface ReportCard {
		int totalMarks(int math,int physics,int bio,int history,int chem);
	}
	public static void main(String[] args) {
		ReportCard report = (m,p,b,h,c) -> {
			m +=10;
			return m+p+b+h+c;
		};
		System.out.println("Adjusted Total: "+report.totalMarks(75, 80, 70, 65, 90));
	}
}