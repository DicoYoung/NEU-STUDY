package Socket;

import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://baidu.com");
		//?后面是参数
		URL u = new URL(url,"/index.html?username=mary");
		System.out.println("协议："+u.getProtocol());
		System.out.println("主机："+u.getHost());
		System.out.println("端口号："+u.getPort());
		System.out.println("文件路径："+u.getPath());
		System.out.println("文件名："+u.getFile());
	}

}
