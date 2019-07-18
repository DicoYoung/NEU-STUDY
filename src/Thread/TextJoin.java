package Thread;

public class TextJoin {

	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("---Main---"+i);
		}
	}

}
