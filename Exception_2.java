package Package1;

public class Exception_2 {

	public static void main(String[] args) {
		// multiple catch block
		
		try {
			int array[] = new int[5];
			//int[] data = {1, 2, 3, 4,5,6,7};
			System.out.println(array[8]);	
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception "+ e.getMessage());	
		}
		catch(Exception e) {
			System.out.println("Exception occurred");	
			}
	}

}
