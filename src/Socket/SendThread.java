package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {

	private Socket s;
	private Scanner sc;
	public SendThread(Socket s) {
		this.s = s;
	}
	public void run() {
		OutputStream os;
		try {
			os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			while(true) {
				sc = new Scanner(System.in);
				System.out.println("«Î ‰»Î£∫");
				String str = sc.next();
				dos.writeUTF(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
