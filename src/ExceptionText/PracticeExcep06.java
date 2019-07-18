package ExceptionText;

public class PracticeExcep06 {
	static int[] arr = new int[3];
	public static void main(String[] args) {
		methodOne();
		System.out.println("main");
	}
	private static void methodOne() {
		methodTwo();
		System.out.println("one");
	}
	private static void methodTwo() {
		methodThree();
		System.out.println("two");
	}
	private static void methodThree() {
		System.out.println(arr[2]);
		System.out.println("three");
	}

}
