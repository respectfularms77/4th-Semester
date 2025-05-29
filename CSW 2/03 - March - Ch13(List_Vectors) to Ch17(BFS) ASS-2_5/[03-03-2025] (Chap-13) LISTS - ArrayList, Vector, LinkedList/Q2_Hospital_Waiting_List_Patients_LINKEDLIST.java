import java.util.*;
public class Q2_Hospital_Waiting_List_Patients_LINKEDLIST {
    public static void main(String[] args) {
		int ch=1;
		Scanner sc=new Scanner(System.in);
		LinkedList arl = new LinkedList<>();
		do {
			System.out.print("See the Menu: \n1.Add Patient\n2.Remove Patient\n3.Check Patient\n4.Display All Patients\n5.Enter 5 to Exit\nEnter your Choice: ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the Patient's name: ");
					String b=sc.nextLine();
					b=sc.nextLine();
					arl.addLast(b);
					System.out.println("The Patient has been added into the List");
					break;
				case 2:
					if (arl.isEmpty()) {
						System.out.println("The List is already empty");
					}
					else {
						arl.removeFirst();
						if (!arl.isEmpty())
							System.out.println("After removing the 1st Patient: "+arl);
					}
					break;
				case 3:
					System.out.print("Enter the Name of the Patient that u want to know about: ");
					b=sc.nextLine();
					b=sc.nextLine();
					if (arl.contains(b)) {
						System.out.println("The Patient is Present in the List at Serial Number: "+arl.indexOf(b)+1);
					}
                    else
                        System.out.println("The Patients name is not found in the List");
					break;
				case 4:
					System.out.println("All the Patients present in the List: "+arl);
					break;
				default:
					ch=5;
			}	
		}while(ch!=5);
		System.out.println("The Program has been Successfully Terminated");
		sc.close();
	}
}