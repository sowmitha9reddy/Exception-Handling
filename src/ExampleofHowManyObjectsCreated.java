

class Dog{
	static int count;

	public Dog() {
		count++;
	}
	/*static void disp() {
		System.out.println(count);
	} */
	
}



public class ExampleofHowManyObjectsCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		Dog d4=new Dog();
		// Dog.disp();
		System.out.println(Dog.count);
		

	}

}
