package EceptionHandlingPractice;

import java.util.Scanner;


class GovernOFINDIA{
	void intilaize() {
		Local l=new Local();
		try {
		l.AcceptInput();
		l.validate();
		}
		catch( Exception u) {
			try {
				l.AcceptInput();
				l.validate();
			}
			catch(Exception y) {
				try {
					l.AcceptInput();
					l.validate();
					}
					catch( Exception v) {
						try {
							l.AcceptInput();
							l.validate();
						}
						catch(Exception w) {
							try {
								l.AcceptInput();
								l.validate();
								}
							catch(Exception x) {
								System.out.println("UnderAge Come after  when your age is above 18  or equal to 18 years");
							}
							
			            }
		            }
		      }
		}
   }
}
	class UnderAgeException extends Exception{
		@Override
		public String getMessage() {
			
			return "underAge";		}
	}
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "overAged";
	}

	
}

class Local{
	int age;
	Scanner scan=new Scanner(System.in);
	void AcceptInput() {
		System.out.println("Enter the age");
		age=scan.nextInt();
	}
	void validate() throws Exception {
		if(age>=18 &&age<=60) {
			System.out.println("take your licnese");
		}
		else if(age<18) {
			UnderAgeException ug=new UnderAgeException();
			System.out.println(ug.getMessage());
			throw ug;
		}
		else if(age>60) {
			OverAgeException og=new OverAgeException();
			System.out.println(og.getMessage());
			throw og;
		}
	}
	
}
public class LicenseExampleRTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GovernOFINDIA g1=new GovernOFINDIA();
		g1.intilaize();

	}

}
