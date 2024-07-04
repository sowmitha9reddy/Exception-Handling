import java.util.Scanner;

class SingleRun extends Thread{
	
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(Thread.currentThread());
		if(name.equals("Thread-0")) {
			add();
		}
		else if(name.equals("Thread-1")) {
			printChar();
			
		}
		else {
			printNum();
		}
	}
	public void add() {
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
    public void printChar() {
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
    public void printNum() {
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
public class MultiThreadingUsingSingleRunMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleRun s1=new SingleRun();
		SingleRun s2=new SingleRun();
		SingleRun s3=new SingleRun();
		
		s1.start();
		s2.start();
		s3.start();
	
		
		

	}

}
