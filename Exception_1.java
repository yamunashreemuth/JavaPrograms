package Package1;

public class Exception_1 {

	public static void main(String[] args) {
		//simple try catch block
		int num1;
		int num2;
		try {
			num1 = 0;
			num2 = 6;
			int res = num2 * num1;
			if(res == 0) {
				System.out.println(res);	
			}					
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
	
		}

}
