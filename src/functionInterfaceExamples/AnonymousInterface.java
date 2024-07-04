package functionInterfaceExamples;
@FunctionalInterface
interface ano{
	void disp();
}
public class AnonymousInterface {
  public static void main(String[] args) {
	ano d=new ano()
	  {
		  @Override
		public void disp() {
			System.out.println("hi helloo");
			
		}
	  };
	  d.disp();
	  
  }
}
