package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Choose0902 {

	private static Scanner scanner;
	@SuppressWarnings("rawtypes")
	private static Comparator c;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		
		while(true) {
			System.out.print("请输入单词：");
			scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			if(temp.equalsIgnoreCase("")) {
				break;
			}else {
				l.add(temp);
			}		
		}
		
		c = null;
		l.sort(c);
		
		System.out.println("集合为：");
		System.out.println(l);
		
	}

}
