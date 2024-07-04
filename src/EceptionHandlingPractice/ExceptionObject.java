package EceptionHandlingPractice;

import java.util.Scanner;
class Demo1{
	Scanner scan=new Scanner(System.in);

	void aplha(){
		int c=0;
		//try {
		System.out.println("connection4 Established");
		System.out.println("connection Established");
  		System.out.println("Enter the numertaor");
  		 c=scan.nextInt()/scan.nextInt();
		//}
		/* catch(Exception e) {
			System.out.println("problem");
		} */
  		System.out.println(c);
  		System.out.println("connection4 terminated");
	}
}
class demo2{
	public void beta() {
System.out.println("connection3 Established");
try {
		Demo1 a= new Demo1();
		a.aplha();
}
catch(Exception e) {
	System.out.println("problem");
}

		System.out.println("connection3 terminated");
	}
	}
class demo23{
	public void gamma() {
		demo2 d=new demo2();
		System.out.println("2 Established");
		d.beta();
		System.out.println("connection2 terminated");
	}
}
public class ExceptionObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  	  
  	System.out.println("connection1 Established");
		demo23 dd=new demo23();
		dd.gamma();
		System.out.println("connection1 Established");
	}

}
