package Thread;

public class TextDeadLockThread1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		DeadLockThread1 t1 = new DeadLockThread1(obj1,obj2);
		DeadLockThread2 t2 = new DeadLockThread2(obj1,obj2);
		
		t1.start();
		t2.start();
	}

}
