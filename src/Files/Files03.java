package Files;

import java.io.File;

public class Files03 {
	/**
	 * C:WINDOWSĿ¼���������Ŀ¼�µ������ļ������ñ�����Ŀ¼��
	  * �ҳ��ļ���������С�ģ���ӡ�ļ���
	  * ��С���ļ�������0���� 
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
		System.out.println("����ļ�Ϊ��"+maxFile.getAbsolutePath()+",���С��:"+maxSize);
		System.out.println("��С�ļ�Ϊ��"+minFile.getAbsolutePath()+",���С��:"+minSize);
	}
	
	

}
