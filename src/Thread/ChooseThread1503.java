package Thread;

public class ChooseThread1503 extends Thread {
	private int m;
	ChooseThread1503(int m){
		this.m = m;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("线程"+m+"正在运行");
		}
	}

}
