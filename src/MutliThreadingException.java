import java.util.Scanner;

class Addition12 implements Runnable{
	@Override
	public void run() {
		System.out.println("Dividng started");
		Scanner scan=new Scanner(System.in);

		   
		   int res=10/0;
		   System.out.println(res);
		   System.out.println("Dividng ended");
		
	}
}
class Characetrs12 implements Runnable{
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
class Numbers12 implements Runnable{
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
public class MutliThreadingException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition12 a=new Addition12();
		Characetrs12 c=new Characetrs12();
		Numbers12 n=new Numbers12();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(c);
		Thread t3=new Thread(n);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
