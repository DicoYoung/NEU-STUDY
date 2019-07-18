package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {

	Socket socket = null;
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String info = "";
			while((info = br.readLine())!= null) {
				System.out.println("我是服务器，客户端说："+info);
			}
			socket.shutdownInput();//关闭输入流
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("欢迎您");
			pw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null != pw) {
					pw.close();
				}
				if(null != os) {
					os.close();
				}
				if(null != br) {
					br.close();
				}
				if(null != isr) {
					isr.close();
				}
				if(null != is) {
					is.close();
				}
			} catch (IOException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
