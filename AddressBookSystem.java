import java.util.*;
public class AddressBookSystem 
{
	ArrayList<Person> addressBook;
	static Scanner sc = new Scanner(System.in);
	
	AddressBookSystem()
	{
		addressBook = new ArrayList<>();
	}
	
	void add()
	{
		System.out.println("Enter the full name of the person:");
		String name = sc.nextLine();
		System.out.println("Enter the address of the person:");
		String address = sc.nextLine();
		System.out.println("Enter the phoneNumber of the person: ");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter the 6digit zipCode");
		int zipCode= sc.nextInt();
		Person person = new Person(name,address,zipCode,phoneNumber);
		addressBook.add(person);
		String dummy=sc.nextLine();
	}
	
	void edit()
	{
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!\n");
			System.out.println("--------------------------------------");
			return;
		}
		
		System.out.println("Enter the fullname of the person whose details you want to edit");
		String name = sc.nextLine();
	
		boolean found=false;
		for(int i=0;i<addressBook.size();i++)
		{
			if(addressBook.get(i).name.equals(name))
			{
				String toContinue="yes";
				while(toContinue.equals("yes")) 
				{
					System.out.println("--------------------------------------");
					System.out.println("\nThe details of the person are:");
					System.out.println(addressBook.get(i)+"\n");
					System.out.println("--------------------------------------");
					System.out.println("Choose an option to edit:");
					System.out.println("1.FullName\t2.Address\t3.phoneNumber\t4.zipCode");
					int option = sc.nextInt();
					String dummy = sc.nextLine();
					switch(option)
					{
						case 1:
							System.out.println("Enter full name: ");
							name=sc.nextLine();
							addressBook.get(i).name=name;
							break;
						
						case 2:
							System.out.println("Enter address: ");
							String address = sc.nextLine();
							addressBook.get(i).address=address;
							break;
							
						case 3:
							System.out.println("Enter phoneNumber: ");
							long phNo = sc.nextLong();
							dummy = sc.nextLine();
							addressBook.get(i).phoneNumber=phNo;
							break;
							
						case 4:
							System.out.println("Enter 6digit zipCode: ");
							int zipCode = sc.nextInt();
							dummy = sc.nextLine();
							addressBook.get(i).zipCode=zipCode;
							break;
							
						default: System.out.println("Invalid option");
					
					}

					System.out.println("Do you want to continue editing: yes/no");
					toContinue=sc.next();
					dummy=sc.nextLine();
				}
				found=true;
				break;
				
			}
		}
		if(found==false)
			System.out.println("\nPerson doesn't exist!");
		
	}
	
	void search()
	{
		
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!\n");
			System.out.println("--------------------------------------");
			return;
		}
		
		System.out.println("Enter the fullname of the person to search");
		String name=sc.nextLine();
	
		boolean found=false;
		for(Person p: addressBook)
		{
			if(p.name.equals(name)) {
				System.out.println("\nDetails are:\n"+p+"\n");
				found=true;
				break;
			}
		}
		if(found==false)
		{
			System.out.println("\nPerson doesn't exist!");
		}

	}
	
	void delete()
	{
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!");
			System.out.println("Cannot delete a person.!\n");
			System.out.println("--------------------------------------");
			return;
		}
		System.out.println("Enter the fullname of the pereson to delete");
		String name=sc.nextLine();

		boolean found=false;
		for(Person p: addressBook)
		{
			if(p.name.equals(name)) {
				addressBook.remove(p);
				System.out.println("\nPerson deleted succesfully!");
				found=true;
				break;
			}
		}
		if(found==false)
		{
			System.out.println("\nPerson doesn't exist!");
		}
		
	}
	
	void sortByName()
	{
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!\n");
			System.out.println("--------------------------------------");
			return;
		}
		Collections.sort(addressBook, new Comparator<Person>() {
			public int compare(Person p1, Person p2)
			{
				if(p1.name.compareTo(p2.name)<0) return -1;
				else if(p1.name.compareTo(p2.name)>0) return 1;
				else return 0;
			}
		});
		
		System.out.println("\nAddress Book sorted by Name:");
		System.out.println("--------------------------------------");
		for(Person p: addressBook)
			System.out.println("\n"+p);
		System.out.println("--------------------------------------");
	}
	
	void sortByZip()
	{
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!");
			System.out.println("--------------------------------------");
			return;
		}
		Collections.sort(addressBook, new Comparator<Person>() {
			public int compare(Person p1, Person p2)
			{
				if(p1.zipCode<p2.zipCode) return -1;
				else if(p1.zipCode>p2.zipCode) return 1;
				else return 0;
			}
		});
		
		System.out.println("\nAddress Book sorted by zipCode:");
		System.out.println("--------------------------------------");
		for(Person p: addressBook)
			System.out.println("\n"+p);
		System.out.println("--------------------------------------");
	}
	
	void display()
	{
		if(addressBook.isEmpty())
		{
			System.out.println("--------------------------------------");
			System.out.println("\nAddress Book is Empty!!\n");
			System.out.println("--------------------------------------");
			return;
		}
		System.out.println("\nAddress Book:");
		System.out.println("----------------------------------------");
		for(Person p: addressBook)
			System.out.println("\n"+p);
		System.out.println("--------------------------------------");
	}

	boolean isEmpty()
	{
		if(addressBook.size()==0)
		{
			return true;
		}
		return false;
	}
}
