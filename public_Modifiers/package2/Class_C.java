package package2;

import package1.Class_A;
import package1.Class_B;                  //we have to import package because we are calling class member from another package

public class Class_C {
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