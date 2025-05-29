import java.util.*;
public class Q3_Team_Project_TrackTasks_VECTORS {
    public static void main(String[] args) {
		int ch=1;
		Scanner sc=new Scanner(System.in);
		Vector arl = new Vector<>(20,20);
		do {
			System.out.print("See the Menu:\n1.Add Task\n2.Remove Task\n3.Display All Tasks\n4.Find Task Indices\n5.Clear all Tasks\n6.Exit\nEnter your Choice: ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the Task's name: ");
					String b=sc.nextLine();
					b=sc.nextLine();
					arl.add(b);
					System.out.println("The Task has been added into the List");
					break;
				case 2:
					if (arl.isEmpty()) {
						System.out.println("The List is already empty");
					}
					else {
						System.out.print("Enter the Task's name to remove it from the List: ");
					    b=sc.nextLine();
					    b=sc.nextLine();
						if (arl.contains(b)) {
                            arl.remove(b);
                            System.out.println("After removing the Specific element from the list, the List has Elements:"+arl);
                        }
                        else
                            System.out.println("The Task is not found in your List");
					}
					break;
				case 3:
					System.out.println("All the Tasks present in the List are: "+arl);
					break;
                case 4:
                    System.out.print("Enter the Name of the Task that u want to know about: ");
                    b=sc.nextLine();
                    b=sc.nextLine();
                    if (arl.contains(b)) {
                        System.out.println("The Task is Present in the List at Serial Number: "+arl.indexOf(b));
                    }
                    else
                    System.out.println("The Task is not found in your List");
                    break;
				case 5:
                    System.out.print("Enter Y to Clear the Task List: ");
                    ch=sc.next().charAt(0);
                    if (ch=='Y' || ch=='y'){
                        arl.clear();
                        System.out.println("Is the Task List cleared: "+arl.isEmpty());
                    }
                    break;
                default:
                    ch=6;
			}	
		}while(ch!=6);
		System.out.println("The Program has been Successfully Terminated");
		sc.close();
	}
}