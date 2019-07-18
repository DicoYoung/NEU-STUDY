package neusedu;
public class Must03 {
	public static void main(String[] args) {
		int[] l = new int[10];
		for(int i = 0;i<10;i++) {
			double temp = (double)(Math.random()*100);
			int temp1 = (int)(Math.round(temp));
			l[i] = temp1;
			
		}
		
		for (int i = 0; i < l.length-1; i++) {
			for (int j = 0; j < l.length-i-1; j++) {
				if(l[j]>l[j+1]) {
					int temp2 = l[j];
					l[j] = l[j+1];
					l[j+1] = temp2;
					
				}
				
			}
		}
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i]+" ");
		}
	}

}
