import java.util.*;
public class Q1_Library_Books_Dynamic_List_ARRAYLIST {
	public static void main(String[] args) {
		int ch=1;
		Scanner sc=new Scanner(System.in);
		ArrayList arl = new ArrayList<>(5);
		do {
			System.out.print("See the Menu: \n1.Add Book\n2.Remove Book\n3.Search Book\n4.Display All Books\n5.Show Total Books\n6.Enter 6 to Exit\nEnter your Choice: ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the Book name: ");
					String b=sc.nextLine();
                    b=sc.nextLine();
					arl.add(b);
					System.out.println("The Book has been added into the List");
					break;
				case 2:
					if (arl.isEmpty()) {
						System.out.println("The List is already empty");
					}
					else {
						arl.remove(arl.size()-1);
						System.out.println("After removing the Last Book: "+arl);
					}
					break;
				case 3:
					System.out.print("Enter the Name of the Book that u want to Search: ");
					b=sc.nextLine();
                    b=sc.nextLine();
					if (arl.indexOf(b)!=-1) {
						System.out.println("Index of element "+b+" is: "+arl.indexOf(b));
					}
					else {
						System.out.println("Book is not in the List");
					}
					break;
				case 4:
					System.out.println("All the books present in the List are: "+arl);
					break;
				case 5:
					System.out.println("Size of the Number of the Books in the List is: "+arl.size());
					break;
				default:
					ch=6;
			}	
		}while(ch!=6);
		System.out.println("The Program has been Successfully Terminated");
		sc.close();
	}
}