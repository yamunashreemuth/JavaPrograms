package Package1;

public class Exception_4 {

	public static void main(String[] args) {
		//number format exception
		try {
		Short shortInt = new Short("2 ");
		Long dcl = Long.decode("562036L");
		System.out.println(shortInt);
		System.out.println(dcl);
		}
		catch(NumberFormatException ne){
			 System.out.println( "Error number: " +ne.getLocalizedMessage()); 
			 System.out.println( ne.fillInStackTrace()); //"Error message: " +
		}
	}

}
