package Package1;

//finally block execute every time if exception occur or not

public class Exception_17 {

	public static void main(String[] args) {
		//exception doesn't occurred in try block 
		try {
		String test = "568";
		int num = Integer.parseInt(test);
		System.out.println(num);
		}
		finally {
			System.out.println("Finally block");
		}
		
	}

}
