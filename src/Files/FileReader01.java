package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	private static FileReader fr;

	public static void main(String[] args)  {
		File f = new File("D:/JAVAFolder/lol4.txt");
		try {
			fr = new FileReader(f);
			char[] c = new char[(int)f.length()];
			fr.read(c);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
