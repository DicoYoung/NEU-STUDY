package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	private static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		File f = new File("D:/JAVAFolder/lol4.txt");
		//out的时候会自动创建一个文件（如果没有的话） 它是用来写到文件里去的
		
		try {
			fos = new FileOutputStream(f);
			byte date[] = {88,89};
			fos.write(date);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
