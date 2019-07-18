package Collections;

import java.util.*;
public class IteratorDemo02 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			l.add(i);
		}
		ListIterator<Integer> lit = l.listIterator();
		
		while(lit.hasNext()) {
			System.out.print(lit.next()+" ");
		}
		System.out.println(l);
		
		//指针放在最左边 要从右边开始往左边走 必须先往右边移动指针
		
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
//		System.out.println(l);
		for (int i = 0; i < 6; i++) {
			
		}
		
		
	}

}
