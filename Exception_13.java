package Package1;

public class Exception_13 {
	int age = 0;
	Exception_13(int age){
		try {
		this.age = age;
		System.out.println("the age is "+age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if(age == 20) {
				System.out.println("Young");
			}
			try { if(age > 35) {
				System.out.println("Adult");
			}
		} catch(java.lang.NumberFormatException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} }
		finally { //if(age == 0)
			System.out.println("not valuable");
		}
	}
	

	public static void main(String[] args) {
		
		Exception_13 excep = new Exception_13(-5);
		//excep.age = -4;
		

	}

}
