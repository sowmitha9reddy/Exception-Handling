import java.util.Scanner;

public class WithoutMUltithereading {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Adding started");

	   System.out.println("Enter the Numeber");
	   int num1=scan.nextInt();
	   System.out.println("Enter the Numeber");
	   int num2=scan.nextInt();
	   int res=num1+num2;
	   System.out.println(res);
	   System.out.println("adding ended");
	   System.out.println();
	   System.out.println("Printing Characters started");
	   
	   for(int i=65;i<75;i++) {
		   System.out.print((char)i);
		   try {
			   Thread.sleep(1000);
			   

		   }
		   catch(Exception e) {
			   //System.out.println("Exception Handeled");
			   e.printStackTrace();
		   }
	   }
	   System.out.println("Printing Characters completed");
	   System.out.println();
	   System.out.println("Printing numbers started");
	   System.out.println("Enter the Numeber");
	   int n=scan.nextInt();
	   for(int i=0;i<n;i++) {
		   System.out.println(i);
		   try {
			   Thread.sleep(1000);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   
	   }
	   

	   
   }
}
