package Socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8848);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			System.out.println("hello client3 "+s.getInetAddress()+" :"+s.getLocalPort());
			dis.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
