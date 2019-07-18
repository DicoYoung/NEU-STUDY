package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodeFile01 {
	//�ļ�����
	//׼��һ���ı��ļ�������ASCII����ַ��������ַ�
	//void encodeFile(File encodeingFile,File encodedFile)
	//�ļ����ܺ�����ݱ��浽encoded�ļ���
	//�����㷨�����֣�����9������ԭ��������+1;9�Ļ���0
	//          ��ĸ������z�������ƶ�һ����a��b����z��a��Z��A��������Сд
	//          ����ĸ�ַ������䣻���ģ�too
	public static void main(String[] args) {
		File encodeingFile = new File("D:/JAVAFolder/encodeingFile.txt");
		File encodedFile = new File("D:/JAVAFolder/encodedFile.txt");
		encodeFile(encodeingFile,encodedFile);
		
	}
	public static void encodeFile(File encodeingFile,File encodedFile)  {
		try(FileReader fr = new FileReader(encodeingFile);FileWriter fw = new FileWriter(encodedFile)){
			char[] c = new char[(int)encodeingFile.length()];
			fr.read(c);
			System.out.println("����ǰ�����ݣ�"+new String(c));
			encode(c);
			System.out.println("���ܺ�����ݣ�"+new String(c));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void encode(char[] c) {
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			if(isLetterOrDigit(ch)) {
				switch(ch) {
				case '9':
					ch = '0';
					break;
				case 'z':
					ch = 'a';
					break;
				case 'Z':
					ch = 'A';
					break;
				default:
					ch++;
					break;
				}
			}
			c[i] = ch;
		}
	}
	private static boolean isLetterOrDigit(char ch) {
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return -1 == str.indexOf(ch) ?false:true;
	}

}
