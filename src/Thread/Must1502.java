package Thread;

public class Must1502 {

	public static void main(String[] args) {
		MustR1 m1 = new MustR1();
		MustR2 m2 = new MustR2();
		MustR3 m3 = new MustR3();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class MustR1 implements Runnable {
	public void run() {
		for (int i = 1; i < 1001; i++) {
			if(isPrime(i)) {
				System.out.println("素数是："+i);
			}
		}
	}
	public  boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

class MustR2 implements Runnable{
	
	public void run() {
		for (int i = 1001; i < 2001; i++) {
			if(isPrime(i)) {
				System.out.println("素数是："+i);
			}
		}
	}
	public  boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}

class MustR3 implements Runnable{
	
	public void run() {
		for (int i = 2001; i < 3001; i++) {
			if(isPrime(i)) {
				System.out.println("素数是："+i);
			}
		}
	}
	public  boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
