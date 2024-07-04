package EceptionHandlingPractice;

import java.util.Scanner;
class Bank3{
	static void Intialize() {
		ATM a=new ATM();
		try {
			a.accessInput();
			a.validate();
		}
		catch(Exception e) {
			a.accessInput();
			try {
				a.accessInput();
				a.validate();
			}
			catch(Exception f){
				try {
					a.accessInput();
					a.validate();
				}
				catch(Exception g) {
					
					try {
						a.accessInput();
						a.validate();
					}
					
					catch(Exception h){
				System.out.println("Card is blocked");
					}
			}
		}
	}
}
}
class ATM {
	int pin=1234;
	int p;
	Scanner scan=new Scanner(System.in);
	void accessInput() {
		System.out.println("Enter the pin");
		p=scan.nextInt();
		
		
	}
	void validate()throws InvalidInputException {
		
		if(p==pin) {
			System.out.println("Collect your Money");
		}
		else {
			InvalidInputException i=new InvalidInputException();
			
			//"Invalid input"
			
			System.out.println( i.getMessage());
			throw i;
		}
		
		
	}
	
}
class InvalidInputException extends Exception{
	@Override
	public String getMessage() {
		
		return "Invalid Input";
	}
	
	
}
public class CustomExceptionExampleRBI {

	public static void main(String[] args) {
		
		Bank3 b=new Bank3();
		b.Intialize();
	}

}

