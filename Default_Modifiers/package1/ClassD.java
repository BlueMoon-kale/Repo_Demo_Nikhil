package package1;

public class ClassD 
{   int a=10;
	void test1() 
	{
	 System.out.println("THis is method test1 from classD");	
    }
     ClassD()
    {
    	
    }
    public static void main(String[]args) 
    {
    	ClassD obj=new ClassD();
    	obj.test1();
    	
    	System.out.println(obj.a); 
    }
}
