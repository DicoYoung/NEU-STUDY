package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodeFile01 {
	//文件加密
	//准备一个文本文件，包含ASCII码的字符和中文字符
	//void encodeFile(File encodeingFile,File encodedFile)
	//文件加密后把数据保存到encoded文件中
	//加密算法：数字：不是9，就在原来基础上+1;9的话变0
	//          字母：不是z，向右移动一个（a→b）；z→a，Z→A；保留大小写
	//          非字母字符，不变；中文，too
	public static void main(String[] args) {
		File encodeingFile = new File("D:/JAVAFolder/encodeingFile.txt");
		File encodedFile = new File("D:/JAVAFolder/encodedFile.txt");
		encodeFile(encodeingFile,encodedFile);
		
	}
	public static void encodeFile(File encodeingFile,File encodedFile)  {
		try(FileReader fr = new FileReader(encodeingFile);FileWriter fw = new FileWriter(encodedFile)){
			char[] c = new char[(int)encodeingFile.length()];
			fr.read(c);
			System.out.println("加密前的内容："+new String(c));
			encode(c);
			System.out.println("加密后的内容："+new String(c));
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
