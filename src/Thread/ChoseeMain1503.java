package Thread;

public class ChoseeMain1503 {

	public static void main(String[] args) {
		ChooseThread1503 ct1 = new ChooseThread1503(1);
		ChooseThread1503 ct2 = new ChooseThread1503(2);
		
		ct1.setPriority(Thread.MAX_PRIORITY);
		ct2.setPriority(6);
		
		ct1.start();
		ct2.start();
	}

}
