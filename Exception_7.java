package Package1;

public class Exception_7 {

	public static void main(String[] args) {
		//class not found exception
		try {
            Class.forName("example.MyInvisibleClass");
        } 
		catch (ClassNotFoundException e) {
           e.printStackTrace();
           System.out.println(e.getLocalizedMessage());
        }

	}

}
