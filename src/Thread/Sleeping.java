package Thread;

public class Sleeping extends Thread {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Thread:"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}

}
