package Package1;


//Finally and try block

class TryBlock{
	
	static class Inner{ //using inner class
	static String display() {
		try {
			String a = "return from try";
			return a;
		}
		finally {
			return "return from finally"; //finally block overrides any return values from try and catch blocks
		}
	}}
}

public class Exception_15 {

	public static void main(String[] args) {

		TryBlock.Inner obj = new TryBlock.Inner();
	System.out.println(obj.display());
		
	}

}
