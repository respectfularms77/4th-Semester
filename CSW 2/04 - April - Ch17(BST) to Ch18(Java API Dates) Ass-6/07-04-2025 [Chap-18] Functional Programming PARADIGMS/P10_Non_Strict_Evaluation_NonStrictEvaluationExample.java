public class P10_Non_Strict_Evaluation_NonStrictEvaluationExample {
	public static void main(String[] args) {
		java.util.Optional<Integer> result = java.util.Optional.ofNullable(10)
		.filter(n -> n > 5)
		.map(n -> n*2);
		result.ifPresent(System.out::println);
	}
}