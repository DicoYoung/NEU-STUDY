package neusedu;

import java.util.*;

public class Practice02 {
private static Scanner scanner;

public static void main(String[] args) {
	System.out.print("In:");
	scanner = new Scanner(System.in);
	String phone = scanner.next();
	String newPhone = phone.substring(0, 3)+"****"+phone.substring(7,phone.length());
	System.out.println("Out:"+newPhone);
}

}



