public class P5_Lambda_With_Multiple_Parameters_Params {
	interface ReportCard {
		int totalMarks(int math,int physics,int bio,int history,int chem);
	}
	public static void main(String[] args) {
		ReportCard report = (m,p,b,h,c) ->  m+p+b+h+c;
		System.out.println("Total: "+report.totalMarks(75, 80, 70, 65, 90));
	}
}