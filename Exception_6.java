package Package1;

public class Exception_6 {

	
		public static int getArange(int str) { 
			try {
				
			if(str > 0 || str < 10) {
			//int res = str.length;
				 throw new IllegalArgumentException("exception");
				//System.out.println("the value of :" + str);
			}	return str;
			}
			catch(IllegalArgumentException ie) {
				System.out.println("IllegalArgumentException caught: "+ie.getCause());
			return str;
		} }
	
	public static void main(String[] args) {
		//illegal argument exception 
		Exception_6 obj = new Exception_6();
			obj.getArange(46);
			//System.out.println(obj.str);
			
	
	}
}
