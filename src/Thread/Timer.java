package Thread;

public class Timer {

	private static int num = 0;
//      δͬ����	
//	public void add(String name) {
//		num++;
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println(name+", ���ǵ�"+num+"��ʹ��Timer���߳�");
//	}
	
	
	
// ����ͬ��
//	public synchronized void add(String name) {
//		num++;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println(name+", ���ǵ�"+num+"��ʹ��Timer���߳�");
//	}
	
	
//      �����ͬ��:
	public  void add(String name) {
		synchronized(this) {
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
			System.out.println(name+", ���ǵ�"+num+"��ʹ��Timer���߳�");
		}
	}

}
