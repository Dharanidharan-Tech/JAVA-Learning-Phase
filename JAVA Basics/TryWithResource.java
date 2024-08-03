package chapter1;

import java.io.*;

public class TryWithResource {

	public static void main(String[] str) throws IOException {
		
		File f = new File("E:\\myfolder\\attachpythonlib.txt");		
		
		try (FileInputStream fin = new FileInputStream(f)) {			
	
			int x;
			
			while((x=fin.read())!=-1) {
				
				System.out.print((char)x);
			}
		
		}
	}
}
