package Thread;

public class T2 extends Thread {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("--------t2--------"+i);
		}
	}

}
