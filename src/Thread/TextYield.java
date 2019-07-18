package Thread;

public class TextYield {

	public static void main(String[] args) {
		YieldThread t = new YieldThread("Y1");
		YieldThread t1 = new YieldThread("Y2");
		t.start();
		t1.start();
	}

}
