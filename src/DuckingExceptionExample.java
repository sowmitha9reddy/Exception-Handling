import java.util.Scanner;

class Demo11{
	Scanner scan=new Scanner(System.in);

	void aplha() throws Exception 
	{
		int c=0;
		
		System.out.println("connection4 Established");
		System.out.println("connection Established");
  		System.out.println("Enter the numertaor");
  		c=scan.nextInt()/scan.nextInt();
  	    System.out.println(c);
  		
  			System.out.println("connection4 terminated");
  		
		
  		
	}
}
public class DuckingExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("connection1 Established");
		   Demo11 d=new Demo11();
		   try {
		   d.aplha();
		   }
		   catch(Exception e) {
				System.out.println("Handledin main");
				
			} 
		   finally {
			   System.out.println("successfully exceuted");
		   } 
		   System.out.println("connection1 terminated");

	}

}
