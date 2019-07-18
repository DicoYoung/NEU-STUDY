package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server6 {

	private static ServerSocket ss;

	public static void main(String[] args) {
		try {
			ss = new ServerSocket(8888);
			while(true) {
				Socket s = ss.accept();
				ServerThread2 st = new ServerThread2(s);
				Thread t = new Thread(st);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
