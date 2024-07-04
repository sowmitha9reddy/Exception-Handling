package EceptionHandlingPractice;

import java.util.Scanner;

public class ExampleOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  Scanner scan=new Scanner(System.in);
      		System.out.println("connection Established");
      		System.out.println("Enter the numertaor");
      		int c=scan.nextInt()/scan.nextInt();
      		System.out.println(c);
      		
      		System.out.println("Enter the size of array");
      		int N=scan.nextInt();
      		int[] ar=new int[N];		
      		System.out.println("Enter the data");
      		int data=scan.nextInt();
      		System.out.println("Enter the index");
      		int index=scan.nextInt();
      		//ar=null;
      		ar[index]=data;
          }
          /*catch(Exception e){
        	  System.out.println("problem");
          } */ // leads to error
          
         
          catch(ArithmeticException a) {
        	  System.out.println("Give non-Zero denimoinator");
        	  
          }
          catch(NegativeArraySizeException n)
          {
        	  System.out.println("Be Positive");
          } catch(Exception e){
        	  System.out.println("problem");
          }
         
         System.out.println("connection terminated");
          
		
	}
	

}
