import java.util.*;
public class AddressBookMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		AddressBookSystem addressBook = new AddressBookSystem();
		int option=1;
		
		while(option!=8)
		{
			System.out.println("\nYou have the following options:\n");
			System.out.println("1. Add a person's details to Address Book");
			System.out.println("2. Edit a persons details");
			System.out.println("3. Search for a user");
			System.out.println("4. Delete a user");
			System.out.println("5. Display entire address book sorted by names");
			System.out.println("6. Display entire address book sorted by zipCode");
			System.out.println("7. View entire address book");
			System.out.println("8. END\n");
			
			System.out.println("Choose one of the options:");
			
			option = sc.nextInt();
			String dummy = sc.nextLine();
			
			switch(option)
			{
				
				case 1: addressBook.add(); break;
				case 2: addressBook.edit(); break;
				case 3: addressBook.search(); break;
				case 4: addressBook.delete(); break;
				case 5: addressBook.sortByName(); break;
				case 6: addressBook.sortByZip(); break;
				case 7: addressBook.display(); break;
				case 8:
					System.out.println("\n\n------------------XXX--------------");
					System.out.println("\n\nADDRESS BOOK SYSTEM EXITED!!\n\n");
					System.out.println("------------------XXX--------------");
					break;
				default: System.out.println("Choose a valid option");
			}
			
			
		}
		
		sc.close();
	}
}
