package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Text {

	public static void main(String[] args)  {
		//��ʹ�÷��� �л�������
//		new Service1().doService1();
//		new Service2().doService2();
		
		//���䷽��
		
		try {
			//���ļ��л�ȡ�����ƺͷ�������
			File f = new File("D:/JAVAFolder/a.txt");
			Properties p = new Properties();
			p.load(new FileInputStream(f));
			String className = (String)p.get("class");
			String methodName = (String)p.get("method");
			//���������ƻ�ȡ�����
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName(className);
			//���ݷ������ƻ�ȡ��������
			@SuppressWarnings("unchecked")
			Method m = clazz.getMethod(methodName);
			//��ȡ������
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Constructor c = clazz.getConstructor();
			//���ݹ�������ʵ��������
			Object service = c.newInstance();
			//���ö����ָ������
			m.invoke(service);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
