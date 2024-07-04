package EceptionHandlingPractice;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
