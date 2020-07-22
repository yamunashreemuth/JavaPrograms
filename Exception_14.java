package Package1;

class Outer{
	int a;
	int b;
	
/*	1) If finally block returns a value then try and catch blocks may or may not return a value.
	2) If finally block does not return a value then both try and catch blocks must return a value. 
	3) If the method returns a value then try-catch or finally no need to return*/
	public int show() {
		a = 50;
		b = 0;
		try {
			System.out.println("Division of 2 no's " + a / b);
			//return a+b;
		}
		catch(Exception e) {
			System.out.println("Exception occurred " + e.getCause());
			//return a+b;
		}
		finally {
			System.out.println("2 no's  are: " + a + ", " + b);
			return a+b;
		}
		
	}
	
	
}

public class Exception_14 {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();
	}

}
