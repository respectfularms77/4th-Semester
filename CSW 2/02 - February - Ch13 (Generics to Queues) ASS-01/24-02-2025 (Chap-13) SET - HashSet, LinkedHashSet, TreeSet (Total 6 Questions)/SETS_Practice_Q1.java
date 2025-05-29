import java.util.*;
public class SETS_Practice_Q1 {
	public static void main(String[] args) {
		HashSet<Integer> StId=new HashSet<Integer>();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice");
			System.out.println("1.Register Student\n2.Check Registration\n3.Display All Registration\n4.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the Student ID: ");
				int id=sc.nextInt();
				if (StId.contains(id)) {
					System.out.println("!!! Duplicate Registration !!!\n");
				}
				else {
					StId.add(id);
					System.out.println("The Student ID "+id+" has been Registered\n");
				}
				break;
			case 2:
				System.out.print("Enter the Student Id to Check Registration :");
				id=sc.nextInt();
				if (StId.contains(id)) {
					System.out.println("!!! Student is Already Present in the Registration List !!!\n");
				}
                else {
                    System.out.println("The Student is not present in the List\n");
                }
				break;
			case 3:
				System.out.println("All Students Id: "+StId+"\n");
				break;
			default:
				System.out.print("Here Enter 4 to Click Out of the Loop: ");
				ch=sc.nextInt();
			}
		}while(ch!=4);
		sc.close();
	}
}