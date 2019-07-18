package DakaSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Company {
	
	static ArrayList<Employee> emp;
	static ArrayList<DakaInfo> infor;
	
	private Scanner scannerID;
	private Scanner scannerName;
	private Scanner scannerPassword;
	
	public Company(){
		Company.emp =  new ArrayList<>();
		Company.infor = new ArrayList<>();
	}
	public void addEmployee() {
		Employee temp = new Employee();
		
		System.out.print("请输入新员工的卡号：");
		scannerID = new Scanner(System.in);
		int ID = scannerID.nextInt();
		
		System.out.print("请输入新员工的姓名：");
		scannerName = new Scanner(System.in);
		String name = scannerName.next();
		
		System.out.print("请输入新员工的密码：");
		scannerPassword = new Scanner(System.in);
		String password = scannerPassword.next();
		
		temp.setID(ID);
		temp.setName(name);
		temp.setPassword(password);
		emp.add(temp);
		
		System.out.println("新员工信息为："+temp);
		System.out.println("新增人员成功！");
		
		DakaInfo aDI = new DakaInfo();
		aDI.ID = ID;
		aDI.inTime = null;
		aDI.outTime = null;
		infor.add(aDI);
		
	}
	public void deleteEmployee() {
		System.out.println("请输入要删除的员工卡号：");
		int tempID = scannerID.nextInt();
		System.out.println("查找人员中...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("查找成功！开始删除.....");
				it.remove();
				System.out.println("删除人员成功！");
			}
			else {
				System.out.println("查无此人！");
			}
		}
		
		
	}
	public void searchEmployee() {
		System.out.println("请输入要查找的员工卡号：");
		int tempID = scannerID.nextInt();
		System.out.println("查找人员中...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("查找成功！");
			}
			else {
				System.out.println("查无此人！");
			}
		}
		
		
	}
	public void showEmployee() {
		System.out.println("请输入要显示信息的员工卡号：");
		int tempID = scannerID.nextInt();
		System.out.println("查找人员中...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("查找成功！员工信息为：");
				System.out.println(tempE.toString());
			}
			else {
				System.out.println("查无此人！");
			}
		}
	}
	public void signIn(int si)   {
		Date tempD = new Date();//获取当前时间
		Iterator<DakaInfo> it = infor.iterator();
		for (int i = 0; i < infor.size(); i++) {
			try {
				if(it.hasNext()) {
					DakaInfo tempDI = it.next();
					if(si == tempDI.ID) {
						if(tempDI.inTime != null) {
							System.out.println("今天已经打过卡了");
						}
						else {
							tempDI.ID = si;
							tempDI.inTime = tempD;
							infor.add(tempDI);
							System.out.println("卡号："+si+"  打卡成功");
						}
					}
				}else {
					System.out.println("无此ID员工");
				}
			} catch (ConcurrentModificationException e) {
				break;
			}
			
		}	
	}
	public void signOut(int so) {
		Date tempD = new Date();
		Iterator<DakaInfo> it = infor.iterator();
		for (int i = 0; i < infor.size(); i++) {
			try {
				if(it.hasNext()) {
					DakaInfo tempDI = it.next();
					if(so == tempDI.ID) {
						if(tempDI.inTime != null) {
							tempDI.ID = so;
							tempDI.outTime = tempD;
							infor.add(tempDI);
							System.out.println("卡号："+tempDI.ID+"  签退成功");
						}
						else {
							System.out.println("卡号："+so+"  今天还没有签到，无法签退");
							
						}
					}
				}else {
					System.out.println("无此ID员工");
				}
			} catch (ConcurrentModificationException e) {
				break;
			}
			
		}

	}	
	public void toFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {	
			fos = new FileOutputStream("D:/JAVAFolder/Dakasystem/DakaDate.txt"); 
			oos = new ObjectOutputStream(fos);
			
			for (int i = 0; i < infor.size(); i++) {
				oos.writeObject(infor.get(i));
				oos.flush();
			}
		} catch (Exception e) {
			
		}
	}
	public void showInfor() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 2; i++) {
			System.out.println("ID为："+infor.get(i).ID+"; 姓名："+emp.get(i).name+"; 签到信息： "+sdf.format(infor.get(i).inTime));
			System.out.println("ID为："+infor.get(i).ID+"; 姓名："+emp.get(i).name+"; 签退信息： "+sdf.format(infor.get(i).outTime));
		}
	}
}

