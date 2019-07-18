package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client5 {

	private static Socket s;

	public static void main(String[] args) {
		try {
			s = new Socket("127.0.0.1",8090);
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("用户名：Hanzong；密码：123");
			pw.flush();
			s.shutdownOutput();
			
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = "";
			while((info = br.readLine())!= null) {
				System.out.println("我是客户端，服务器说："+info);
			}
			br.close();
			is.close();
			pw.close();
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
