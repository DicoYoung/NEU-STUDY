package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileClose01 {

	public static void main(String[] args) {
		File f = new File("D:/JAVAFolder/lol5.txt");
		try(FileInputStream fis = new FileInputStream(f)){
			byte[] b = new byte[(int)f.length()];
			fis.read(b);
			for(byte byt:b) {
				System.out.println(byt);
			}
		} catch(IOException e) {
			
		}
	}

}
