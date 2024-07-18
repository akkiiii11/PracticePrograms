package methodoverloading;

//method overloading
public class MathOperations {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		MathOperations mo = new MathOperations();
		mo.add(10, 20);			//compiler
		mo.add(10, 20, 30);
		mo.add(10.5, 20.5);
	}

}
