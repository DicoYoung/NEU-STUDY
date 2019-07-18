package DakaSystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class HappyFriday712 {
	
	private static ArrayList<String> str;
	@SuppressWarnings("rawtypes")
	private static Map<ArrayList,Date> time;
	private static Scanner scanner;
	
	

	public static void main(String[] args) {
		endGame();
		happy();
		friday();
	}
	private static void endGame() {
		File f = new File("D:/JAVAFolder/endGame");
		f.mkdir();
		File f1 = new File("D:/JAVAFolder/endGame/endGame.exe");
		File f2 = new File("D:/JAVAFolder/endGame/endGame.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void happy()  {
		scanner = new Scanner(System.in);
		System.out.print("Enter the name :");
		String tempS = scanner.next();
		Date tempD = new Date();
		try {
			str.add(tempS);
			time.put(str, tempD);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		
		
	}
	private static void friday() {
		System.out.println("][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][");
		try {
			Thread.sleep(2000);
			System.out.println("][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

