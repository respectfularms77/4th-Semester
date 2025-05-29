public class Q6_Generics_program_pg366_UextendsString<T> {
    private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	public <U extends String> void inspect(U u){
		System.out.println("T: "+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}
	public static void main(String[] args) {
		Q6_Generics_program_pg366_UextendsString<Integer> iBox = new Q6_Generics_program_pg366_UextendsString<Integer>();
		iBox.set(15);
		iBox.inspect("some text"); // error: is presented since this would still be	returning a String
	}
}