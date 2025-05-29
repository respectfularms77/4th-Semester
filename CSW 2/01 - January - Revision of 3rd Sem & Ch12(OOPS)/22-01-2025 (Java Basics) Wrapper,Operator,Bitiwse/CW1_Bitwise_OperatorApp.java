public class CW1_Bitwise_OperatorApp {
    public static void main(String[] args) {
        int x = 3; // Base
        int y = 16; // y = 2^4
        int result = pow(x, y);
        System.out.println("Result: " + result);

        int a=10,b=35;
        result = add(a,b);
        System.out.println("Result: of "+a+" + "+b+" = "+ result);

        result = subtract(b, a);
        System.out.println("Result: of "+b+" - "+a+" = "+ result);

        int std=28;
        System.out.println("Parity is: "+par(std));
    }
    public static int pow(int x, int y) {
        if (y <= 0 || (y & (y - 1)) != 0) {
            System.out.println("Enter the Right value of Y");
        }

        int multiplications = 0;
        int result = 1;

        while (y > 1) {
            result *= x; // Multiply by x
            multiplications++;
            y >>= 1; // Right shift y by 1 (equivalent to dividing by 2)
        }

        System.out.print("Number of multiplications: " + multiplications+"\t");
        return result;
    }
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b; // Calculate carry
            a = a ^ b; // Sum without carry
            b = carry << 1; // Carry is shifted
        }
        return a;
    }
    public static int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b; // Calculate borrow
            a = a ^ b; // Subtract without borrow
            b = borrow << 1; // Borrow is shifted
        }
        return a;
    }
    public static int par(int n) {
        int count = 0;
        while (n != 0) {
            if((n&1)==1)  {count++;}
            n >>>= 1;
        }
        return count;
    }

}