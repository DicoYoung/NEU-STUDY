package Thread;

public class MakingDumplings implements Runnable {
	
	public void run() {
		System.out.println("���ӣ�����");
		System.out.println("���ӣ�����");
		for (int i = 0; i < 30; i++) {
			System.out.println("���ӣ�ߦ��Ƥ");
			System.out.println("���ӣ�������");
		}
		System.out.println("���ӣ������");
	}

}
