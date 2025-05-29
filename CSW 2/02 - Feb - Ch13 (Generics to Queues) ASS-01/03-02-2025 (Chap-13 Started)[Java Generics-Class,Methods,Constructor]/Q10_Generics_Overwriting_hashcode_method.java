
public class Q10_Generics_Overwriting_hashcode_method {
	public int myVar;
	public Q10_Generics_Overwriting_hashcode_method(int myVar) {		this.myVar = myVar;		}
	public boolean equals(Object o) {
				if(o instanceof Q10_Generics_Overwriting_hashcode_method) {
					Q10_Generics_Overwriting_hashcode_method hTest = (Q10_Generics_Overwriting_hashcode_method) o;
					if (hTest.myVar == this.myVar) {		return true;	} 
					else {						return false;					}
				}
				else {					
					return false;				}
	}
	public int hashCode() {
		return (myVar + 23);
	}
	public static void main(String args[]) {
		Q10_Generics_Overwriting_hashcode_method ob=new Q10_Generics_Overwriting_hashcode_method(15);
		Q10_Generics_Overwriting_hashcode_method ob1=new Q10_Generics_Overwriting_hashcode_method(115);
		System.out.println("If 2 Objects r Equal: "+ob.equals(ob1));
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
	}
}
