package Files;

import java.io.File;
import java.util.Date;

public class Files01 {

	public static void main(String[] args) {
		File f1 = new File("D:/JAVAFolder");
		f1.mkdirs();//���Ǵ����ļ��е�
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("JAVAOK.exe");
		System.out.println(f2.getAbsolutePath());
//		f2.mkdirs();
		
		File f3 = new File(f1,"JAVAOK.exe");
		System.out.println(f3.getAbsolutePath());
//		f3.mkdirs();
		
		File f = new File("D:/JAVAFolder/JAVAOK.exe");
		System.out.println("��ǰ�ļ�"+f);
		System.out.println("�ж��ļ��Ƿ����"+f.exists());
		System.out.println("�ж��Ƿ����ļ���"+f.isDirectory());
		System.out.println("�ж��Ƿ����ļ�"+f.isFile());
		System.out.println("�ļ�������"+f.length());
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("�ļ���󴴽�ʱ��"+d);
		f.setLastModified(0);
		
		File fn = new File("D:/JAVAFolder/JAVANO.exe");
		f.renameTo(fn);
	}
}
