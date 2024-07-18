package methodoverloading;

public class Example1 {
	
	public void createContact(String name, int num)
	{
		System.out.println("Name: " +name+ " Number: " +num);
	}
	
	public void createContact(String name, int num, int num2)
	{
		System.out.println("Name: " +name+ " Number: " +num+ " Number2: " +num2);
	}

	public static void main(String[] args) {
		
		Example1 contact1 = new Example1();
		contact1.createContact("Akanksha", 985632569);
		contact1.createContact("Nivedita", 985647845,85697456);

	}

}
