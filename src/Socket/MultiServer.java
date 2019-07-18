package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	private static ServerSocket ss;

	public static void main(String[] args) {
		try {
			ss = new ServerSocket(9632);
			System.out.println("¼àÌý¶Ë¿Ú:9632");
			Socket s = ss.accept();
			new SendThread(s).start();
			new RecieceThread(s).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
