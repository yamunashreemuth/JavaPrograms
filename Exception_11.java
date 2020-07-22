package Package1;

public class Exception_11 {

	public void negativeArray() {
		int[] sampleArr = new int[-1];
	}
	public static void main(String[] args) {
		// 
		try{
			Exception_11 test =  new Exception_11();
			test.negativeArray();
		}
		catch(java.lang.NegativeArraySizeException nas) {
			nas.printStackTrace();
		}

	}

}
