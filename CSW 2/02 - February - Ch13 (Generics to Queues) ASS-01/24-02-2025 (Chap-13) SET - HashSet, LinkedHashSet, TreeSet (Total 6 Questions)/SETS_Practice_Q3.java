import java.util.*;
public class SETS_Practice_Q3 {
	public static void main(String[] args) {
		TreeSet<Integer> StID=new TreeSet<Integer>();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1.Register Student\n2.Check Registration\n3.Display All Registration\n4.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the Student's ID: ");
				int id=sc.nextInt();
				if (StID.contains(id)) {
					System.out.println("!!! Duplicate Registration !!!\n");
				}
				else {
					StID.add(id);
					System.out.println("The Student's ID "+id+" has been Registered\n");
				}
				break;
			case 2:
				System.out.print("Enter the Student's Id:");
				id=sc.nextInt();
				if (StID.contains(id)) {
					System.out.println("!!! Student is Already Present in the Registration List !!!\n");
				}
                else {
                    System.out.println("The Visitor is not present in the List\n");
                }
				break;
			case 3:
				System.out.println("All Students ID in a Ascending Order "+StID+"\n");
				break;
            case 4:
				System.out.print("Enter the Roll  Number u Want to Search: ");
                id=sc.nextInt();
                
			default:
				System.out.print("Here Enter 4 to Click Out of the Loop: ");
				ch=sc.nextInt();
			}
		}while(ch!=4);
		sc.close();
	}
}