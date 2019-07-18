package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	//��ӡ�����Ϣ������Ա��������Ա����
	@SuppressWarnings("rawtypes")
	public static void printClassMethodMessage(Object obj) {
		Class c = obj.getClass();
		System.out.println("������ƣ�"+c.getName());
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			//�õ���������ֵ���͵�����
			Class returnType = ms[i].getReturnType();
			System.out.println("����ֵ���ͣ�"+returnType);
			//�õ�����������
			System.out.println("���������ƣ�"+ms[i].getName());
			//�õ������б��������
			Class[] paramType = ms[i].getParameterTypes();
			for (Class class1:paramType) {
				System.out.println(class1.getName()+",");
			}
		}	
	}
	//��ȡ��Ա��������Ϣ
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void printClassFieldMessage(Object obj) {
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//�õ���Ա���������͵�������
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			//�õ���Ա����������
			String fieldName = field.getName();
			System.out.println("��Ա���������ƣ�"+fieldName);
		}
	}
	//��ȡ���캯����Ϣ
	@SuppressWarnings("rawtypes")
	public static void printClassConstructorMessage(Object obj) {
		Class c = obj.getClass();
		Constructor[] cs = c.getConstructors();
		for (Constructor constructor : cs) {
			System.out.println("���췽�����ƣ�"+constructor.getName());
			Class[] paramType = constructor.getParameterTypes();
			for(Class class1:paramType) {
				System.out.print(class1.getName()+" ");
			}
			
		}	
		
	}

}
