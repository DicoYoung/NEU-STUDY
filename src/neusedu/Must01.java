package neusedu;

import java.util.*;
public class Must01 {
	private static Scanner scanner1;
	private static Scanner scanner2;

	public static void main(String[] args) {
		System.out.print("First number:");
		scanner1 = new Scanner(System.in);
		String a = scanner1.next();
		System.out.print("Second number:");
		scanner2 = new Scanner(System.in);
		String b = scanner2.next();
		
		Integer A = new Integer(a);
		Integer B = Integer.valueOf(b);
		Integer C = A+B;
		
		System.out.println("The final number is:"+C);
	}

}
