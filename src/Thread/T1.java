package Thread;

public class T1 extends Thread {
//	private boolean timeOut = false;
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("--------t1--------"+i);
		}
	}
	
	public void stopThread() {
//		timeOut = true;
	}

}
