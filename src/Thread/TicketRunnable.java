package Thread;

public class TicketRunnable implements Runnable{
	private int tickets = 50;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"-R is saling tickets"+tickets--);
			}else {
				System.out.println("Æ±ÒÑÂôÍê");
				break;
			}
		}
	}

}
