package upcasting;

public class countno {

	public static void main(String[] args) {
		
		int num=1234;
		int temp=0;
		while(num!=0) {
			
			num=num/10;
			temp++;
		}
System.out.println( temp);
	}

}
