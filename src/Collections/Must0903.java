package Collections;

public class Must0903 {

	public static void main(String[] args) {
		String[] str = new String[4];
		str[0] = "apple";
		str[1] = "grape";
		str[2] = "banana";
		str[3] = "pear";
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j = 0; j < str.length-i-1; j++) {
				int result = str[j].compareTo(str[j+1]);
				if (result > 0) {
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		System.out.println("����Ԫ��Ϊ��"+str[3]);
		System.out.println("��С��Ԫ��Ϊ��"+str[0]);
		System.out.println("������Ϊ��");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		
		
		

	}

}
