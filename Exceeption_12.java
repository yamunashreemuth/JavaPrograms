package Package1;
import java.util.Arrays;
import java.util.List;

public class Exceeption_12 {

	public static void main(String[] args) {
		//
		String[] name = {"text", "java", "class", "methods"};
		List<String> namelist = Arrays.asList(name);
		try {
			namelist.add("inheritance");
		} catch(java.lang.UnsupportedOperationException ue) {
			ue.printStackTrace();
		}
	}

}
