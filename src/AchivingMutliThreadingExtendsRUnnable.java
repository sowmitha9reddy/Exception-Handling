import java.util.Scanner;

class Addition extends Thread{
	@Override
	public void run() {
		System.out.println("Adding started");
		Scanner scan=new Scanner(System.in);

		   System.out.println("Enter the Numeber");
		   int num1=scan.nextInt();
		   System.out.println("Enter the Numeber");
		   int num2=scan.nextInt();
		   int res=num1+num2;
		   System.out.println(res);
		   System.out.println("adding ended");
	}
	
}
class Characters extends Thread{
	@Override
	public void run() {
		for(int i=65;i<75;i++) {
			   System.out.println((char)i);
			   try {
				   Thread.sleep(1000);
				   

			   }
			   catch(Exception e) {
				   //System.out.println("Exception Handeled");
				   e.printStackTrace();
			   }
		   }
		System.out.println("Printing Characters completed");
	}
}

class numbers extends Thread{
	@Override
	public void run() {
		Scanner scan=new Scanner(System.in);

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
		   System.out.println("Printing numbers completed");
	}
}


public class AchivingMutliThreadingExtendsRUnnable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Addition a=new Addition();
		Characters c=new Characters();
		numbers n=new numbers();
		a.start();
		c.start();
		n.start();

	}

}
