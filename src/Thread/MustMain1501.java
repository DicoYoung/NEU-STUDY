package Thread;

public class MustMain1501 {

	public static void main(String[] args) {
		MustThread1 mt1 = new MustThread1();
		mt1.start();
		MustThread2 mt2 = new MustThread2();
		mt2.start();
		MustThread3 mt3 = new MustThread3();
		mt3.start();
	}

}
class MustThread1 extends Thread{
	
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
class MustThread2 extends Thread{
	
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
class MustThread3 extends Thread{
	
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
