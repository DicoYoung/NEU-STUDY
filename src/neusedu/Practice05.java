package neusedu;

import java.util.*;

import java.text.*;
public class Practice05 {
	private static Scanner scanner;

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("��������Ʒ���������ڣ���yyyy-MM-dd��");
		scanner = new Scanner(System.in);
		String pro = scanner.next();
		System.out.println("�����뱣���ڣ��죩��");
		int day = scanner.nextInt();
		Date nowDate = new Date();
		System.out.println("��������Ϊ��"+sdf.format(nowDate));
		
		Date proDate = sdf.parse(pro);
		
		Calendar c = Calendar.getInstance();
		c.setTime(proDate);
		c.add(Calendar.DATE,day);
		Date dieDate = c.getTime();
		
		
		int result = dieDate.compareTo(nowDate);
		if(result<0) {
			System.out.println("����Ʒ�Ѿ�����");
		}else {
			long lost = dieDate.getTime()-nowDate.getTime();
			long lostDay = Math.round(lost/(24*60*60*1000));
			System.out.println("����"+lostDay+"�����");
		}
		
		
		
	}
	

}
