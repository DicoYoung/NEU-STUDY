package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {

	private static ServerSocket ss;

	public static void main(String[] args) {
		try {
			ss = new ServerSocket(8090);
			int count = 0;
			System.out.println("服务器即将启动");
			while(true) {
				Socket s = ss.accept();
				ServerThread st = new ServerThread(s);
				st.start();
				count++;
				System.out.println("客户端数量："+count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
