package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client6 {

	private static Scanner sc;

	public static void main(String[] args) {
		Socket s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			s = new Socket("127.0.0.1",8888);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
			while(true) {
				sc = new Scanner(System.in);
				System.out.println("客户端：");
				String str = sc.nextLine();
				pw.println(str);
				if(str.equals("exit")) {
					break;
				}
				
				String msg = br.readLine();
				System.out.println("接受到服务器的数据："+msg);
				
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null != s) {
					s.close();
				}
				if(null != br) {
					br.close();
				}
				if(null != pw) {
					pw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
