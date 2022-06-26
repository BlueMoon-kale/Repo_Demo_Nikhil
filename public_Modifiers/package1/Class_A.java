package package1;

public class Class_A {
	public int a=10;
	public void method1() 
	{
		System.out.println("This is method1 from Class_A");
	}
    public Class_A() 
    {
    	int cons=25;
    	System.out.println(cons);
    }    
  public static void main(String args[]) 
  {
	  Class_A obj=new Class_A();
	  obj.method1();
	  
	  System.out.println("obj.a");
	    
  }
}
