package ExceptionText;

public class PriacticeExcep01 {

	public static void main(String[] args) {
		int i = 0;
		String java[] = {"java01","java02","java03"};
		try {
			while(i < 4) {
				System.out.println(java[i]);
				i++;	
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
