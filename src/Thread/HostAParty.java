package Thread;

public class HostAParty {

	public static void main(String[] args) {
		MakingDumplings m = new MakingDumplings();
		MakingPeanuts m1 = new MakingPeanuts();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("¿ÍÈË"+i+"£ºÇë½ø");
		}
	}

}
