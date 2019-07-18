package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread2 implements Runnable {
	Socket s;
	private Scanner sc;
	
	public ServerThread2(Socket s) {
		this.s = s;
	}
	
	public void run() {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				String str = br.readLine();
				if(str.equals("exit")) {
					break;
				}
				System.out.println("接受客户端数据："+str);
				System.out.println("服务器说：");
				
				sc = new Scanner(System.in);
				String serverStr = sc.nextLine();
				pw.println(serverStr);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null != pw) {
					pw.close();
				}
				if(null != br) {
					br.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
}
