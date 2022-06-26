package upcasting;

public class Dog extends Animal {

	protected static int var=10;
	
	public Dog() 
	{
		makenoise();
		var++;
		
	}
		public void makenoise() 
	{   System.out.println("From child class:");
		System.out.println("woof");
		System.out.println(var);
	}
	public static void main(String[] args)
	{
		Animal pet= new Dog();
		pet.makenoise();

	}

}
