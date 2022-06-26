package package1;

public class ClassA 
{
	private int a=20;
    private void test1() 
    {
    System.out.println("This is my test method from classA");	
    } 
    private ClassA() 
    {
	 
    }
    public static void main(String args[]) 
    {
    	ClassA obj =new ClassA();
    	obj.test1();
    	
    	System.out.println(obj.a); 
    }
}
