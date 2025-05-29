abstract class LibRes {
	private String title,author;
	public LibRes(String t,String au) {
		title=t;	author=au;
	}
	public void setdata(String t,String au) {
		title=t;	author=au;
	}
	public String gett()		            {return title;}
	public String geta()		            {return author;}
	public abstract void displaydetails();	
}

class Book extends LibRes {
	int pgcnt;
	public Book(String t, String au,int pg) {
		super(t, au);
		pgcnt=pg;
	}
	public void setv(int pg) {
		pgcnt=pg;
	}
	public void displaydetails() {
		System.out.println("Title: "+gett()+" Author: "+geta()+" Page Count: "+pgcnt);
	}
}

class Magazine extends LibRes {
	String issd;
	public Magazine(String t, String au,String isd) {
		super(t, au);
		issd=isd;
	}
	public void setv(String isd) {
		issd=isd;
	}
	public void displaydetails() {
		System.out.println("Title: "+gett()+" Author: "+geta()+" Issue Date: "+issd);
	}
}

class DVD extends LibRes {
	String dur;
	public DVD(String t, String au,String dur) {
		super(t, au);
		this.dur=dur;
	}
	public void setv(String d) {
		dur=d;
	}
	public void displaydetails() {
		System.out.println("Title: "+gett()+" Author: "+geta()+" Duration: "+dur);
	}
}

public class Q7A {
	public static void main(String[] args) {
		Book b1=new Book("Full Stack Java Development","Dr. Mayur Ramgir",700);
		Magazine m1=new Magazine("ABC","XYZ","20th January 2002");
		DVD d1=new DVD("123","456","2 Minutes 30 seconds");
		
		b1.displaydetails();
		m1.displaydetails();
		d1.displaydetails();
	}
}
