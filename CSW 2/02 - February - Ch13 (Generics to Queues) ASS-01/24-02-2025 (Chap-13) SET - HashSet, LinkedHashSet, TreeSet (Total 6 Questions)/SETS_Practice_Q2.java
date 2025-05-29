import java.util.*;
public class SETS_Practice_Q2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ViId=new LinkedHashSet<Integer>();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1.Register Visitor\n2.Check Registration\n3.Display All Registration\n4.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the Visitor's ID: ");
				int id=sc.nextInt();
				if (ViId.contains(id)) {
					System.out.println("!!! Duplicate Registration !!!\n");
				}
				else {
					ViId.add(id);
					System.out.println("The Visitor's ID "+id+" has been Registered\n");
				}
				break;
			case 2:
				System.out.print("Enter the Visitors Id:");
				id=sc.nextInt();
				if (ViId.contains(id)) {
					System.out.println("!!! Visitor is Already Present in the Registration List !!!\n");
				}
                else {
                    System.out.println("The Visitor is not present in the List\n");
                }
				break;
			case 3:
				System.out.println("All Visitors ID in a Sequential Logged In: "+ViId+"\n");
				break;
			default:
				System.out.print("Here Enter 4 to Click Out of the Loop: ");
				ch=sc.nextInt();
			}
		}while(ch!=4);
		sc.close();
	}
}