package Package1;

class NoMethod{
	int res;
	NoMethod(int res){
		res = this.res;
	}
}

public class Exception_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = "exception";
			NoMethod.class.getDeclaredMethod(name);
		}
		catch(java.lang.NoSuchMethodException me) {
			me.printStackTrace();
		}

	}

}
