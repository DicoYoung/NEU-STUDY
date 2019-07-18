package ExceptionText;

public class PracticeExcep02 {

	public static void main(String[] args) {
		try {
			int x = 0;
			@SuppressWarnings("unused")
			int y = 5/x;
		} catch (Exception e) {
			System.out.println("Exception");
		} 
//		catch (ArithmeticException ae) {  //已经Exception了 顺序在AE前
//			System.out.println("Arithmetic Exception");
//		}
		System.out.println("finished");
	}

}
