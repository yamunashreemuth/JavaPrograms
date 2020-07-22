package Package1;
import java.io.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
public class Exception_20 {

	public static void main(String[] args) {
		
		InputStream input = null;
		input = new FileInputStream("sql.txt"); //G:\\Yamuna docs\\College docs\\AEM training\\
		if (input != null) {
		       try {
		    	   
		         input.read();
		     	input.close();
		       }
		       catch (IOException exp) {
		           System.out.println(exp);
		       }

	}

}}
