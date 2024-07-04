import java.util.Scanner;

class Demo11{
	Scanner scan=new Scanner(System.in);

	void aplha() throws Exception 
	{
		int c=0;
		//try {
		System.out.println("connection4 Established");
		System.out.println("connection Established");
  		System.out.println("Enter the numertaor");
  		try {
  			 c=scan.nextInt()/scan.nextInt();
  			System.out.println(c);
  		}
		
		catch(Exception e) {
			System.out.println("Handledin aplha");
			throw e;
		} 
  		
  		finally {
  			System.out.println("connection4 terminated");
  		}
	}
}
public class DifferentWaysHandlingException {
   public static void main(String[] args) {
	   System.out.println("connection1 Established");
	   Demo11 d=new Demo11();
	   try {
	   d.aplha();
	   }
	   catch(Exception e) {
			System.out.println("Handledin main");
			
		} 
	   /*finally {
		   System.out.println("successfully exceuted");
	   } */
	   System.out.println("connection1 terminated");
	   
   }
}