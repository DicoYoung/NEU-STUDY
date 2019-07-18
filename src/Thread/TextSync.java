package Thread;

public class TextSync implements Runnable {
	Timer timer = new Timer();
	public static void main(String[] args) {
		TextSync text = new TextSync();
		Thread t1 = new Thread(text);
		Thread t2 = new Thread(text);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run() {
		timer.add(Thread.currentThread().getName());
	}
	

}
