package Package1;
//import java.io.IOException;

public class Exception_3 {

	public static void main(String[] args) {
		// 
		try {
		int array[] = new int[5];
		array[8] = 40 / 0; //both arrayindex and Arithmetic exception will occur
		System.out.println(array[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index exception " + e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException is first catch block");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception " + e.getMessage());
			System.out.println("Arithmetic exception will execute first");
		}
		 catch(NumberFormatException ne){
			 System.out.println("Error number: " + ne.getLocalizedMessage());
		 }
		
		//compilation error occur if we add general exception block first
		catch(Exception e) {
			System.out.println("Exception occurred" );
		}
		
	}

}
