package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieceThread extends Thread {

	private Socket s;
	public RecieceThread(Socket s) {
		this.s = s;
	}
	public void run() {
		InputStream is = null;
		DataInputStream dis = null;
		try {
			is = s.getInputStream();
			dis = new DataInputStream(is);
			while(true) {
				String msg = dis.readUTF();
				System.out.println("Ω” ’µΩ£∫"+msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
