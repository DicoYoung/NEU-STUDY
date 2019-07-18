package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/JAVAFolder/lol4.txt");
		FileInputStream fis = new FileInputStream(f);
		//in的时候 必须要已经有一个文件在那里了 他是从已有文件里读取
		
		try {
			
			byte[] b = new byte[(int)f.length()];
			fis.read(b);
			for(byte byt:b) {
				System.out.println(byt);
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
	}

}
