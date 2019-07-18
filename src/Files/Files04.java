package Files;

import java.io.File;
import java.io.IOException;

public class Files04 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/JAVAFolder/skin/OKk.txt");
		f.createNewFile();
	}
}
