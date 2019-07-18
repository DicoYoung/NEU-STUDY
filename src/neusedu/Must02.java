package neusedu;

import java.util.*;
public class Must02 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.print("«Î ‰»Î£∫");
		scanner = new Scanner(System.in);
		String str = scanner.next();
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(i, i+1);
			if(temp.equalsIgnoreCase("e")) {
				k++;
			}
			
		}
		System.out.println("There are "+k+" 'e'.");
			
		}
	}
	
	


