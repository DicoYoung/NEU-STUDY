package Thread;

public class TicketThread extends Thread {
	private int tickets = 50;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"-T is saling tickets"+tickets--);
			}else {
				System.out.println("Æ±ÒÑÂôÍê");
				break;
			}
		}
	}

}
