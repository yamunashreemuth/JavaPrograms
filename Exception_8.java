package Package1;

public class Exception_8 {
	int data;
	public Exception_8(int data) {
		data = this.data;
	}
	
	public static void main(String[] args) {
		// no such field exception
		
		try {
			String name = "exception";
			Exception_8.class.getDeclaredField(name);
		}
		catch(java.lang.NoSuchFieldException ne) {
			ne.printStackTrace();
		}
	}

}
