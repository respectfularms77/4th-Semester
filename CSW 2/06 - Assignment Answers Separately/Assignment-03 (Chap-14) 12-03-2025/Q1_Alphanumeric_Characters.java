public class Q1_Alphanumeric_Characters {
	public static void chk(String a) {
		if (a == null || a.isEmpty())		throw new NullPointerException("String\'s Null");	
		else {	
			String b="";
			for (int i=0;i<a.length();i++) {
				if (Character.isDigit(a.charAt(i))) 	b+=a.charAt(i)+" ";
			}
			if (b.length()==0)		System.out.println("No Numerics are present");
			else	System.out.println("The Numeric Characters are: "+b);
		}
	}
	public static void main(String[] args) {
		String a="str5689c045";
		try {
			chk(a);
		}	catch(NullPointerException e) {
			System.out.println("No Characters present in the String: "+e.getMessage());
		}
	}
}