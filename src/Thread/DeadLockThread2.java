package Thread;

public class DeadLockThread2 extends Thread {

	private Object obj1;
	private Object obj2;
	public DeadLockThread2(Object obj1,Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run() {
		synchronized (obj2) {
			System.out.println("线程2已锁定obj2对象,正在等待obj1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (obj1) {
				System.out.println("线程2已经锁定obj1对象，完成运行");
			}
		}
	}

}
