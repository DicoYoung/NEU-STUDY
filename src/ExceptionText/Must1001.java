package ExceptionText;



import java.util.Scanner;

public class Must1001 {

	private static Scanner scanner;


	public static void main(String[] args)  {
		try {
			System.out.print("�����������");
			scanner = new Scanner(System.in);
			String divisor = scanner.next();
			int a = Integer.parseInt(divisor);
			
			String dividend = scanner.next();
			int b = Integer.parseInt(dividend);
			
			int temp = a/b;
			System.out.println(temp);
		} catch (ArrayIndexOutOfBoundsException  aiobe) {
			aiobe.printStackTrace();	
			
		} catch (NumberFormatException  ne) {
			ne.printStackTrace();	
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("���Ǳ�ִ��");
		} 
		
		
		
		
	}

}
