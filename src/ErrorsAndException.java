import java.util.Scanner;

public class ErrorsAndException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=Integer.MAX_VALUE;
		//2.int [] ar=new int[n];    //runtime-error Examples
        disp();
	}
	static  void disp() {
		try {
		//1.
			disp();
		}
		catch(Throwable e) { // but using this  we canot handled this error -this is example of(runtime-error)
			System.out.println("handled");
		}
	} 

}
