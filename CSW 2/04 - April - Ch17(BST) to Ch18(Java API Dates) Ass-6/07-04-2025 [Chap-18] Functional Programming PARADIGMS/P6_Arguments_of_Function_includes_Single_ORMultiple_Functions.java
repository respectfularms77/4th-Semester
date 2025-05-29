public class P6_Arguments_of_Function_includes_Single_ORMultiple_Functions {
	public static double areaOfRectangle(RectangleFunction lengthFunction, RectangleFunction breadthFunction) {
		//Call the functions to get the Length and Breadth of Function
		double length = lengthFunction.calculate();
		double breadth = breadthFunction.calculate();
		return length*breadth;
	}
	public static void main(String[] args) {
		RectangleFunction lengthValues=new RectangleFunction() {
			public double calculate() {
				double length=5.0;
				return length;
			}
		};
		
		RectangleFunction breadthValues=new RectangleFunction() {
			public double calculate() {
				double breadth=6.0;
				return breadth;
			}
		};
		
		double area=areaOfRectangle(lengthValues,breadthValues);
		System.out.println("Area of rectangle: "+area);
	}
}
interface RectangleFunction {
	//Function to Calculate the Area of the Rectangle
	double calculate();
}