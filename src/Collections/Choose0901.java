package Collections;
/**
 * ѡ����01
 * @author dc
 * 2019-07-09
 */
import java.util.*;
public class Choose0901 {

	public static void main(String[] args) {
		Map<Integer,Cus> userInf = new HashMap<>();
		
		Cus cus = new Cus();
		cus.setName();
		cus.setMoney();
		
		userInf.put(100, cus);
		
		System.out.println("����Ϊ��"+userInf.get(100).name);
		System.out.println("ʣ����Ϊ��"+userInf.get(100).money);
	}
	

}
class Cus{
	String name;
	double money;
	private Scanner scanner;
	private Scanner scanner2;
	
	void setName() {
		System.out.print("����������");
		scanner = new Scanner(System.in);
		this.name = scanner.next();
	}
	void setMoney() {
		System.out.print("�����");
		scanner2 = new Scanner(System.in);
		this.money = scanner2.nextDouble();
	}
	
}
