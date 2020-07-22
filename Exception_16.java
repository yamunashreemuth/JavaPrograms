package Package1;

class ExceptionTest{
	//exception not caught	
	String[] array = new String[6];
	
	public String display() {
		String name = array[6];
		try {
		System.out.println(name);
		}
		catch(java.lang.NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
		System.out.println("Exception not caught in catch");
		return name;
	}	
}


public class Exception_16 {

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		test.display();

	}

}
