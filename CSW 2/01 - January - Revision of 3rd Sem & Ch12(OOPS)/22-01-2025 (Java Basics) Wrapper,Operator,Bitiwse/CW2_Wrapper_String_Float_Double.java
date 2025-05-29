import java.util.Scanner;
public class CW2_Wrapper_String_Float_Double {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Float Value(using Float type): ");
        float n=sc.nextFloat();
        Float f1=n;
        Float f2=new Float(n);
        Float f3=Float.valueOf(n);
        System.out.println("Float Value using Normal Autoboxing: "+f1);
        System.out.println("Float Value using Constructor: "+f2);
        System.out.println("Float Value using ValueOf: "+f3);
        System.out.print("Enter a Float Value(using String type): ");
        String fs=sc.next();
        Float f4=Float.parseFloat(fs);
        Float f5=new Float(fs);
        Float f6=Float.valueOf(fs);
        System.out.println("Float Value using Normal Autoboxing: "+f4);
        System.out.println("Float Value using Constructor: "+f5);
        System.out.println("Float Value using ValueOf: "+f6);

        System.out.print("Enter a Boolean Value: ");
        String s=sc.next();     s.toLowerCase();    Boolean b=null;
        if(s.equals("true") || s.equals("false")) {
            b=new Boolean(s);
        }
        else {
            System.out.println("Invalid Boolean Value");
        }
        System.out.println(b);

        System.out.print("Enter the Double Value as String: ");
        String d=sc.next();
        double dd=Double.valueOf(d);
        System.out.println("Double Value: "+dd);
        
        int n1=(int)dd; boolean chk=false;
        for(int i=2;i<Math.sqrt(n1);i++)    if(n1%i==0) {    chk=true;    break;   }
        if(chk)    System.out.println(n1+" is not a Prime Number");
        else if(!chk) System.out.println("This is a Prime Number ");
    }
}