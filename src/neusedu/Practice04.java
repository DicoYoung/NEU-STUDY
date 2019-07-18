package neusedu;

import java.util.*;
import java.text.*;
public class Practice04 {

	public static void main(String[] args) {
		String str1 = "2019-07-08 14:40:00";
		String str2 = "2019-07-09 14:40:00";
		
		Date maxDate = max(str1,str2);
		System.out.println(maxDate);
	}
	private static Date max(String str1,String str2) {
		Date maxDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int result = str1.compareToIgnoreCase(str2);
		if(result>0) {
			try {
				maxDate = sdf.parse(str1);
			} catch (ParseException e) {
				
			}
		}
		else if(result<0){
			try {
				maxDate = sdf.parse(str2);
			} catch (ParseException e) {
				
			}
		}
		return maxDate;
		
	}

}
