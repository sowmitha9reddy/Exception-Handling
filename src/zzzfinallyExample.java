import java.util.Scanner;

public class zzzfinallyExample {

	public static void main(String[] args) {
		Scanner scan=null;
		try {
			 scan=new Scanner(System.in);
			
			String s=scan.nextLine();
		}
		finally {
			scan.close();
		}
		
	}

}
