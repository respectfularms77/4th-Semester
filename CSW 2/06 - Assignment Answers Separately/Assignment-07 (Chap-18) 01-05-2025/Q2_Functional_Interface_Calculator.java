interface Calculator {
    public double calculate(double x,double y);
}
public class Q2_Functional_Interface_Calculator {
    public static void main(String args[]) {
        Calculator add = (x,y) -> x+y;
        Calculator subs = (x,y) -> x-y;
        Calculator mul = (x,y) -> x*y;
        Calculator div = (x,y) -> (y!=0) ? x/y : Double.NaN;
        System.out.println("Let the 2 Numbers be: 20 & 10");
        System.out.println("Addition: "+add.calculate(10, 20)+"\nSubstraction: "+subs.calculate(20, 10)
        +"\nMultiplication: "+mul.calculate(20, 10)+"\nDivision: "+div.calculate(20, 10));
    }
}