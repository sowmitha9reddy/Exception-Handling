package functionInterfaceExamples;

@FunctionalInterface 
interface  disp3{
	
	void disp(int a);
	//void disp();
}
public class lambdaExpression {
 public static void main(String[] args) {
	  //disp3 d=(int a)->{
		disp3 d=a ->{
		  System.out.println("hello namasther" +a);
	  };
	  d.disp(10);
 }
}
