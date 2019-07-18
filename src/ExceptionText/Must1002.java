package ExceptionText;

import java.util.Scanner;

public class Must1002 {

	private static Scanner scanner1;

	public static void main(String[] args) throws NullPointerException {
		scanner1 = new Scanner(System.in);
		String str1 = scanner1.next();
//		Scanner scanner2 = new Scanner(System.in);
//		String str2 = scanner2.next();
		String str2 = null;
		try {
			str1.compareTo(str2);
		} catch(NullPointerException npe) {
			System.out.println("Got NullPointerException");
		}
	}

}
