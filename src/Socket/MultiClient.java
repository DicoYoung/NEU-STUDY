package Socket;

import java.io.IOException;
import java.net.Socket;

public class MultiClient {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("127.0.0.1",9632);
			new SendThread(s).start();
			new RecieceThread(s).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
