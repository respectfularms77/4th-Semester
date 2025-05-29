public class Q8_Generics_with_toString {
    String name,city;
	public Q8_Generics_with_toString(String name,	String city){
		this.name=name;
		this.city=city;
	}
	public String toString() {
		return "Persons's Name & Place is: "+name+" "+city;
	}
	public static void main(String args[]){
		Q8_Generics_with_toString s1=new Q8_Generics_with_toString("Arpit", "Odisha");
		Q8_Generics_with_toString s2=new Q8_Generics_with_toString("Rohan","Mumbai");
		System.out.println(s1);
		System.out.println(s2);
	}
}