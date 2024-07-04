package functionInterfaceExamples;
class disp{
	void disp1() {
		System.out.println("hii hello namsthet");
	}
}

public class anyonousExampleClass {
 public static void main(String[] args) {
	 
	 disp d=new disp() {
		 @Override
		void disp1(){
			System.out.println("hello hii");
		}
	 };
	 d.disp1();
 }
 
}
