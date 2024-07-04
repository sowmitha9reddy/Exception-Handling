package functionInterfaceExamples;

import java.util.Scanner;
interface hello{
	void disp();
}

public class heloo {

	public static void main(String[] args) {
		//inner class

		class hello1 implements hello{
			@Override
			public void disp() {
				System.out.println("Hello");
				
			}
		}
		            
		             hello1 h=new hello1();
		             h.disp();
		             
	}
	Scanner sacn=new Scanner(System.in);
	String s=sacn.next();
	int n=sacn.nextInt();
		

}
