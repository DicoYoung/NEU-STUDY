package DakaSystem;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		Company com = new Company();
		com.addEmployee();
		com.addEmployee();
		System.out.println("�����Ϣ�ɹ�");
		
		st:while(true) {
			System.out.println("----Ա����ϵͳ------------|");
			System.out.println("���� 0--------�˳�                         |");
			System.out.println("���� 1--------ǩ��                         |");
			System.out.println("���� 2--------ǩ��                         |");
			System.out.println("���� 3--------�鿴ǩ��ǩ����Ϣ     |");
			System.out.println("----------------------------|");
			System.out.print("��������ִ�еĲ�����");
			
			scanner = new Scanner(System.in);
			int act = scanner.nextInt();
			
			switch (act) {
			case 1:
				System.out.println("������Ҫǩ��Ա����ID��");
				Scanner sc1 = new Scanner(System.in);
				int tempID1 = sc1.nextInt();
				com.signIn(tempID1);
				com.toFile();
				
				break;
			case 2:
				System.out.println("������Ҫǩ��Ա����ID��");
				Scanner sc2 = new Scanner(System.in);
				int tempID2 = sc2.nextInt();
				com.signOut(tempID2);
				com.toFile();
				break;
			case 3:
				System.out.println("����Ϣ��¼Ϊ��");
				com.showInfor();
				break;
			case 0:
				System.out.println("�˳�");
				break st;
			default:
				System.out.println("other");
				break;
			}
		}
		
		 
	}

}
