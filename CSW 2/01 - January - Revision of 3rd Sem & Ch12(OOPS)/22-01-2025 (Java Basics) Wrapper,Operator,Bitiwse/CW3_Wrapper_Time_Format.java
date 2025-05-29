import java.util.Scanner;
public class CW3_Wrapper_Time_Format {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Double Value(using Double type): ");
        double n=sc.nextDouble();
        Double f2=new Double(n);
        Double f3=Double.valueOf(n);
        System.out.println("Double Value using Normal Autoboxing: "+f1);
        System.out.println("Double Value using Constructor: "+f2);
        System.out.println("Double Value using ValueOf: "+f3);
        System.out.print("Enter a Double Value(using String type): ");
        String fs=sc.next();
        Double f4=Double.parseDouble(fs);
        Double f5=new Double(fs);
        Double f6=Double.valueOf(fs);
        System.out.println("Double Value using Normal Autoboxing: "+f4);
        System.out.println("Double Value using Constructor: "+f5);
        System.out.println("Double Value using ValueOf: "+f6);


        System.out.println("Enter the Time in hh:mm:ss: ");
        String time = sc.next(),t=""; int c=0,hh=0,mm=0,ss=0;
        for(int i=0;i<time.length();i++)    {
            if(time.charAt(i)!=':')       t=t+time.charAt(i);
            
            if(time.charAt(i)==':' && c==0)    {
                hh=Integer.parseInt(t);
                t="";    c++;
            }
            else if(time.charAt(i)==':' && c==1) {
                mm =Integer.parseInt(t);
                t=""; c++;
            }
            else if(t.length()==2 && c==2) {
                ss=Integer.parseInt(t);
                t=""; c++;
            }
        }

        System.out.println("Time is: "+hh+":"+mm+":"+ss);
        System.out.println("Added Time Value is: "+(hh+mm+ss));
    }
}