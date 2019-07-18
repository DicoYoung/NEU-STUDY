package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;



public class Client2 {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",7788);
			OutputStream os = (OutputStream) s.getOutputStream();
			os.write(111);
			os.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
