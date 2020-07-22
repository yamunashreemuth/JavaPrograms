package Package1;

public class Exception_5 {

	public static void main(String[] args) {
		//Null pointer exception
		String test = null;
		try {
		if(test.equals("name")) {
			System.out.println("Match");
		}else {
			System.out.println("No match");
		}
		}
		catch(NullPointerException e) {
			System.out.println("Exception " +e.getLocalizedMessage());
		}

	}

}
