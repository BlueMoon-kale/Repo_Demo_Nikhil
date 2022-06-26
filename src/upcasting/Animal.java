package upcasting;

public class Animal {

	protected static int var=0;
	
	public Animal() 
	{
		makenoise();
		var++;
	}

	public void makenoise() 
	{   System.out.println("from parent class");
		System.out.println("woof");
		System.out.println(var);
		
	}
	
}
