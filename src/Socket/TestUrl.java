package Socket;

import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://baidu.com");
		//?�����ǲ���
		URL u = new URL(url,"/index.html?username=mary");
		System.out.println("Э�飺"+u.getProtocol());
		System.out.println("������"+u.getHost());
		System.out.println("�˿ںţ�"+u.getPort());
		System.out.println("�ļ�·����"+u.getPath());
		System.out.println("�ļ�����"+u.getFile());
	}

}
