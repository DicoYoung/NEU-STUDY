package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7788);
			System.out.println("¼àÌýÔÚ¶Ë¿ÚºÅ£º7788");
			Socket s = ss.accept();
			InputStream is = s.getInputStream(); 
			int msg = is.read();
			System.out.println("¼àÌýµ½£º"+msg);
			is.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
