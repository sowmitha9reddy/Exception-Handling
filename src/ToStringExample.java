import java.util.Arrays;

class Student01{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student01(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", age=" + age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}


public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student01 s=new Student01(1,"tim",76);
		System.out.println(s.getAge());
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s);
		
		int[] ar=new int[] {20,20,30,40};
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		String s1=new String("Java");
		System.out.println(s1);
		}

}
