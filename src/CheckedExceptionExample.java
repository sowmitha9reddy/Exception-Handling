import java.util.Scanner;

class Demo{
	static void dsip()throws Exception{
		
	}
}
public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo.dsip();
		
		
	//unchecked exception
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		
		
		
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
			Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("Handled in main");
			}
		}

	}

}
