package Thread;

import java.util.Date;

public class Must1504 {

	public static void main(String[] args) {
		sleepTime st = new sleepTime();
		Thread t = new Thread(st);
		t.start();
	}

}
class sleepTime implements Runnable {
	public void run() {
		
		while(true) {
			try {
				Date time = new Date();
				System.out.println("当前时间为："+time);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
