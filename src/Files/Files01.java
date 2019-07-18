package Files;

import java.io.File;
import java.util.Date;

public class Files01 {

	public static void main(String[] args) {
		File f1 = new File("D:/JAVAFolder");
		f1.mkdirs();//这是创建文件夹的
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("JAVAOK.exe");
		System.out.println(f2.getAbsolutePath());
//		f2.mkdirs();
		
		File f3 = new File(f1,"JAVAOK.exe");
		System.out.println(f3.getAbsolutePath());
//		f3.mkdirs();
		
		File f = new File("D:/JAVAFolder/JAVAOK.exe");
		System.out.println("当前文件"+f);
		System.out.println("判断文件是否存在"+f.exists());
		System.out.println("判断是否是文件夹"+f.isDirectory());
		System.out.println("判断是否是文件"+f.isFile());
		System.out.println("文件长度是"+f.length());
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("文件最后创建时间"+d);
		f.setLastModified(0);
		
		File fn = new File("D:/JAVAFolder/JAVANO.exe");
		f.renameTo(fn);
	}
}
