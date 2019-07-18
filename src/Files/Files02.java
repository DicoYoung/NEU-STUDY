package Files;

import java.io.File;
import java.util.Arrays;

public class Files02 {

	public static void main(String[] args) {
		File f = new File("D:/JAVAFolder/skin"); 
//		//以字符串组的形式返回当前文件夹下的所有文件（不包含子文件（夹））
//		String[] s = f.list();
//		System.out.println(Arrays.toString(s));
//		//以文件数组的形式返回当前文件夹下的所有文件（不包含子文件（夹））
//		File[] f1 = f.listFiles();
//		System.out.println(Arrays.toString(f1));
//		//获取上一级目录
//		String parentStr = f.getParent();
//		System.out.println(parentStr);
		f.mkdirs();
		//列出所有盘符
		File[] a = File.listRoots();
		System.out.println(Arrays.toString(a));
		//删除文件
//		f.delete();
	}

}
