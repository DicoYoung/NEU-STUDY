package Files;

import java.io.File;

public class Files03 {
	/**
	 * C:WINDOWS目录，遍历这个目录下的所有文件（不用遍历子目录）
	  * 找出文件中最大和最小的，打印文件名
	  * 最小的文件不能是0长度 
	 */
	public static void main(String[] args) {
		File f = new File("C:/WINDOWS");
		File[] fis = f.listFiles();
		long maxSize = 0;
		long minSize = Integer.MAX_VALUE;
		File maxFile = null;
		File minFile = null;
		for(File file:fis) {
			if(file.isFile()) {
				if(file.length()>maxSize) {
					maxSize = file.length();
					maxFile = file;
				}
				if(file.length()!=0 && file.length()<minSize) {
					minSize = file.length();
					minFile = file;
				}
			}
		}
		System.out.println("最大文件为："+maxFile.getAbsolutePath()+",其大小是:"+maxSize);
		System.out.println("最小文件为："+minFile.getAbsolutePath()+",其大小是:"+minSize);
	}
	
	

}
