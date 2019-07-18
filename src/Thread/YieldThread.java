package Thread;

public class YieldThread extends Thread {
	YieldThread(String s){
		super(s);
	}
	public void run() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+":"+i);
			if((i%10)==0) {
				Thread.yield();
			}
		}
	}

}
