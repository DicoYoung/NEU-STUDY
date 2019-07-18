package Collections;
/**
 * 选做题01
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
		
		System.out.println("姓名为："+userInf.get(100).name);
		System.out.println("剩余金额为："+userInf.get(100).money);
	}
	

}
class Cus{
	String name;
	double money;
	private Scanner scanner;
	private Scanner scanner2;
	
	void setName() {
		System.out.print("输入姓名：");
		scanner = new Scanner(System.in);
		this.name = scanner.next();
	}
	void setMoney() {
		System.out.print("输入金额：");
		scanner2 = new Scanner(System.in);
		this.money = scanner2.nextDouble();
	}
	
}
