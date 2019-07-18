package ExceptionText;

import java.util.*;
public class PracticeExcep03 {

	private static Scanner scanner;

	public static void main(String[] args) {
		int number[] = { 3,4,2,6 };
		try {
			for (int i = 0; i < number.length; i++) {
				scanner = new Scanner(System.in);
				int input = scanner.nextInt();
				System.out.println(number[i]/input);
			}
		} catch (InputMismatchException|ArithmeticException e) {
			System.out.println("ÊäÈë´íÎó£¡");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
