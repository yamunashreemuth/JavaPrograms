package Package1;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;

public class Exception_19 {

	public static void main(String[] args) {
		File lfile = null;
		BufferedReader rd = null;
		try {
			 lfile = new File("G:\\Yamuna docs\\College docs\\AEM training\\sql1.txt");
		    //rd  = new BufferedReader(new FileReader(new File(lfile)));
		    FileReader fr = new FileReader(lfile);
		  //  if ( rd.readLine() != null) {
		    //	System.out.println(lfile);
		//}
		}
		catch(FileNotFoundException fe) {
			fe.getLocalizedMessage();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
