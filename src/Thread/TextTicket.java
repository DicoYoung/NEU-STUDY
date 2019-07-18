package Thread;

public class TextTicket {

	public static void main(String[] args) {
		TicketThread t1 = new TicketThread();
		TicketThread t2 = new TicketThread();
		TicketThread t3 = new TicketThread();
		t1.start();
		t2.start();
		t3.start();
		TicketRunnable tr = new TicketRunnable();
		Thread t4 = new Thread(tr);
		Thread t5 = new Thread(tr);
		Thread t6 = new Thread(tr);
		t4.start();
		t5.start();
		t6.start();
	}

}
