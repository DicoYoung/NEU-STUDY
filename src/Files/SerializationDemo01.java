package Files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo01 {
	
	public static void main(String[] args)  {
		FileOutputStream fos = null;

		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("D:/JAVAFolder/io/customerOUT.txt");

			oos = new ObjectOutputStream(fos);

			
			CUstomer c1 = new CUstomer("Bob",20,"5678");
			CUstomer c2 = new CUstomer("Ash",25,"1234");
			
			System.out.println("-----对象序列化-----");
			
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
			

			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();

		} finally {
			try {
				if(null != fos) {
					fos.close();
				}
				if(null != oos) {
					oos.close();
				}

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("D:/JAVAFolder/io/customerOUT.txt");
			ois = new ObjectInputStream(fis);
			Object c = null;
			while((c = ois.readObject())!= null) {
				CUstomer c1 = (CUstomer)c;
				System.out.println(c1.age+" "+c1.name+" "+c1.password);
			}
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("------读取完毕------");
			e.getStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
//		File Exe = new File("D:/JAVAFolder/OveRwaTch.py");
//		try {
//			Exe.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
