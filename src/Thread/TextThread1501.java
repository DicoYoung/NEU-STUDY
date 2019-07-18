package Thread;

public class TextThread1501 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		int i = 0;
		if(i == 30) {
			Thread t1 = new Thread1501();
			Thread t2 = new Thread1501();
			t1.start();
			t2.start();
		}
	}

}
