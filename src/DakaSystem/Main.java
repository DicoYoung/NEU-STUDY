package DakaSystem;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		Company com = new Company();
		com.addEmployee();
		com.addEmployee();
		System.out.println("添加信息成功");
		
		st:while(true) {
			System.out.println("----员工打卡系统------------|");
			System.out.println("输入 0--------退出                         |");
			System.out.println("输入 1--------签到                         |");
			System.out.println("输入 2--------签退                         |");
			System.out.println("输入 3--------查看签到签退信息     |");
			System.out.println("----------------------------|");
			System.out.print("请输入想执行的操作：");
			
			scanner = new Scanner(System.in);
			int act = scanner.nextInt();
			
			switch (act) {
			case 1:
				System.out.println("请输入要签到员工的ID：");
				Scanner sc1 = new Scanner(System.in);
				int tempID1 = sc1.nextInt();
				com.signIn(tempID1);
				com.toFile();
				
				break;
			case 2:
				System.out.println("请输入要签退员工的ID：");
				Scanner sc2 = new Scanner(System.in);
				int tempID2 = sc2.nextInt();
				com.signOut(tempID2);
				com.toFile();
				break;
			case 3:
				System.out.println("打卡信息记录为：");
				com.showInfor();
				break;
			case 0:
				System.out.println("退出");
				break st;
			default:
				System.out.println("other");
				break;
			}
		}
		
		 
	}

}
