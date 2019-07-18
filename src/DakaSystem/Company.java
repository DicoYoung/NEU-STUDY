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
		
		System.out.print("��������Ա���Ŀ��ţ�");
		scannerID = new Scanner(System.in);
		int ID = scannerID.nextInt();
		
		System.out.print("��������Ա����������");
		scannerName = new Scanner(System.in);
		String name = scannerName.next();
		
		System.out.print("��������Ա�������룺");
		scannerPassword = new Scanner(System.in);
		String password = scannerPassword.next();
		
		temp.setID(ID);
		temp.setName(name);
		temp.setPassword(password);
		emp.add(temp);
		
		System.out.println("��Ա����ϢΪ��"+temp);
		System.out.println("������Ա�ɹ���");
		
		DakaInfo aDI = new DakaInfo();
		aDI.ID = ID;
		aDI.inTime = null;
		aDI.outTime = null;
		infor.add(aDI);
		
	}
	public void deleteEmployee() {
		System.out.println("������Ҫɾ����Ա�����ţ�");
		int tempID = scannerID.nextInt();
		System.out.println("������Ա��...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("���ҳɹ�����ʼɾ��.....");
				it.remove();
				System.out.println("ɾ����Ա�ɹ���");
			}
			else {
				System.out.println("���޴��ˣ�");
			}
		}
		
		
	}
	public void searchEmployee() {
		System.out.println("������Ҫ���ҵ�Ա�����ţ�");
		int tempID = scannerID.nextInt();
		System.out.println("������Ա��...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("���ҳɹ���");
			}
			else {
				System.out.println("���޴��ˣ�");
			}
		}
		
		
	}
	public void showEmployee() {
		System.out.println("������Ҫ��ʾ��Ϣ��Ա�����ţ�");
		int tempID = scannerID.nextInt();
		System.out.println("������Ա��...");
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()) {
			Employee tempE = (Employee) it.next();
			if(tempID == tempE.getID()) {
				System.out.println("���ҳɹ���Ա����ϢΪ��");
				System.out.println(tempE.toString());
			}
			else {
				System.out.println("���޴��ˣ�");
			}
		}
	}
	public void signIn(int si)   {
		Date tempD = new Date();//��ȡ��ǰʱ��
		Iterator<DakaInfo> it = infor.iterator();
		for (int i = 0; i < infor.size(); i++) {
			try {
				if(it.hasNext()) {
					DakaInfo tempDI = it.next();
					if(si == tempDI.ID) {
						if(tempDI.inTime != null) {
							System.out.println("�����Ѿ��������");
						}
						else {
							tempDI.ID = si;
							tempDI.inTime = tempD;
							infor.add(tempDI);
							System.out.println("���ţ�"+si+"  �򿨳ɹ�");
						}
					}
				}else {
					System.out.println("�޴�IDԱ��");
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
							System.out.println("���ţ�"+tempDI.ID+"  ǩ�˳ɹ�");
						}
						else {
							System.out.println("���ţ�"+so+"  ���컹û��ǩ�����޷�ǩ��");
							
						}
					}
				}else {
					System.out.println("�޴�IDԱ��");
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
			System.out.println("IDΪ��"+infor.get(i).ID+"; ������"+emp.get(i).name+"; ǩ����Ϣ�� "+sdf.format(infor.get(i).inTime));
			System.out.println("IDΪ��"+infor.get(i).ID+"; ������"+emp.get(i).name+"; ǩ����Ϣ�� "+sdf.format(infor.get(i).outTime));
		}
	}
}

