package Thread;

public class TextSleep {

	public static void main(String[] args) {
		Sleeping s = new Sleeping();
		s.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("Main:"+i);
		}
	}

}
