package Package1;

class Student{
	int mark;
	String subject;
	int studID;
	char c;
	Student(){
		mark = 50;
		subject = "Math";
		studID = 105052;
		c = subject.charAt(8);
	}
}

public class Exception_18 {

	public static void main(String[] args) {
		try {
			
			Student check = new Student();
			System.out.println(check.studID); 
			System.out.println(check.c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception occurred" ); 
		e.printStackTrace();
		}
	}

}
