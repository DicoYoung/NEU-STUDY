package neusedu;

import java.util.*;

import java.text.*;
public class Practice05 {
	private static Scanner scanner;

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("请输入商品的生产日期：（yyyy-MM-dd）");
		scanner = new Scanner(System.in);
		String pro = scanner.next();
		System.out.println("请输入保质期（天）：");
		int day = scanner.nextInt();
		Date nowDate = new Date();
		System.out.println("今天日期为："+sdf.format(nowDate));
		
		Date proDate = sdf.parse(pro);
		
		Calendar c = Calendar.getInstance();
		c.setTime(proDate);
		c.add(Calendar.DATE,day);
		Date dieDate = c.getTime();
		
		
		int result = dieDate.compareTo(nowDate);
		if(result<0) {
			System.out.println("该商品已经过期");
		}else {
			long lost = dieDate.getTime()-nowDate.getTime();
			long lostDay = Math.round(lost/(24*60*60*1000));
			System.out.println("还有"+lostDay+"天过期");
		}
		
		
		
	}
	

}
