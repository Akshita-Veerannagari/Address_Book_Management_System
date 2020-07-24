public class Person 
{
	String name;
	String address;
	int zipCode;
	long phoneNumber;
	
	Person(String name, String address, int zipCode, long phoneNumber)
	{
		this.name=name;
		this.address=address;
		this.zipCode=zipCode;
		this.phoneNumber=phoneNumber;
	}
	
	public String toString()
	{
		return "Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber+"\nZipCode: "+zipCode;
	}
}
