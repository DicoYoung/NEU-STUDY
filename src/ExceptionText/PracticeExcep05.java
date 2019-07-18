package ExceptionText;

import java.io.File;
import java.io.IOException;

public class PracticeExcep05 {

	public static void main(String[] args) throws IOException {
		PracticeExcep05 it = new PracticeExcep05();
		try {
			it.creatFile("c:/abc.txt");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void creatFile(String path) throws IOException{
		File f = new File(path);
		try {
			f.createNewFile();
		} catch(IOException ie) {
			ie.printStackTrace();
			throw ie;
		}
	}

}
