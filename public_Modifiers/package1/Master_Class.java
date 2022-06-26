package package1;

public class Master_Class {
 public static void main(String args[]) 
 {
	Class_A obj= new Class_A();
	obj.method1();
	
	Class_B objb=new Class_B();
    objb.method2();
    
	System.out.println(obj.a);
	System.out.println(objb.b);
 }
}
