package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TextInetAddress {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("�������"+address.getHostName());
			System.out.println("IP��ַ��"+address.getHostAddress());
//			byte[] bytes = address.getAddress();
			System.out.println(address);
			
//			InetAddress address2 = InetAddress.getByName("DICO");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
