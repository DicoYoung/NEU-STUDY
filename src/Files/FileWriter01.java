package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter01 {

	public static void main(String[] args) {
		File f = new File("D:/JAVAFolder/lol5.txt");
		try {
			FileWriter fw = new FileWriter(f);
			String date = "�׵�:LAJI-MAN";
			@SuppressWarnings("unused")
			char[] c = date.toCharArray();
			fw.write(date);
			fw.close();//���ر��� �����ڴ��� ���ͷ� δ��ȡ���ļ���
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
