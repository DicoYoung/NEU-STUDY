package Files;

import java.io.File;
import java.util.Arrays;

public class Files02 {

	public static void main(String[] args) {
		File f = new File("D:/JAVAFolder/skin"); 
//		//���ַ��������ʽ���ص�ǰ�ļ����µ������ļ������������ļ����У���
//		String[] s = f.list();
//		System.out.println(Arrays.toString(s));
//		//���ļ��������ʽ���ص�ǰ�ļ����µ������ļ������������ļ����У���
//		File[] f1 = f.listFiles();
//		System.out.println(Arrays.toString(f1));
//		//��ȡ��һ��Ŀ¼
//		String parentStr = f.getParent();
//		System.out.println(parentStr);
		f.mkdirs();
		//�г������̷�
		File[] a = File.listRoots();
		System.out.println(Arrays.toString(a));
		//ɾ���ļ�
//		f.delete();
	}

}
