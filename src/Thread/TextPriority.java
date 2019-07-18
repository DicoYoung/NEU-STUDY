package Thread;

public class TextPriority {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t1.stopThread();
		System.out.println("T1的优先级:"+t1.getPriority());
		System.out.println("T2的优先级:"+t2.getPriority());
	}

}
