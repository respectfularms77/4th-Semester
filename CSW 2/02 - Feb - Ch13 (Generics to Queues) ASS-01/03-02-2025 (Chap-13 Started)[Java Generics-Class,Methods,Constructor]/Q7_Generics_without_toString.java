public class Q7_Generics_without_toString {
    String name,city;
	public Q7_Generics_without_toString(String name,String city){
		this.name=name;
		this.city=city;
	}
	public static void main(String args[]){
		Q7_Generics_without_toString s1=new Q7_Generics_without_toString("Arpit", "Odisha");
		Q7_Generics_without_toString s2=new Q7_Generics_without_toString("Rohan","Mumbai");
		System.out.println(s1);
		System.out.println(s2);
	}
}