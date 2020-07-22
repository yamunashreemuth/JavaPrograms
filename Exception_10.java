package Package1;

public class Exception_10 {

	public static void main(String[] args) {
		// Array store exception
		try {
		Object sample[] = new Integer[3];
		sample[1] = new String("text");}
		catch(java.lang.ArrayStoreException  ae) {
			ae.printStackTrace();
		}
	}

}
