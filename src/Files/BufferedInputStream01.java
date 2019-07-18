package Files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStream01 {

	private static BufferedInputStream bis;
	private static BufferedOutputStream bos;

	public static void main(String[] args)  {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:/JAVAFolder/ioa.txt");
			fos = new FileOutputStream("D:/JAVAFolder/iob.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int c = 0;
			while((c = bis.read()) != -1) {
				char ch = (char)c;
				bos.write(ch);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
