package Thread;

public class Timer {

	private static int num = 0;
//      未同步：	
//	public void add(String name) {
//		num++;
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println(name+", 你是第"+num+"个使用Timer的线程");
//	}
	
	
	
// 方法同步
//	public synchronized void add(String name) {
//		num++;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println(name+", 你是第"+num+"个使用Timer的线程");
//	}
	
	
//      代码块同步:
	public  void add(String name) {
		synchronized(this) {
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
			System.out.println(name+", 你是第"+num+"个使用Timer的线程");
		}
	}

}
