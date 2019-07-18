package Collections;


import java.util.*;


public class Pracetice0901 {

	public static void main(String[] args) {
//		ArrayList l = new ArrayList();
//		l.add("aaa");
//		l.add("bbb");
//		l.add(new Integer(11));
//		l.get(0);
		
		@SuppressWarnings("rawtypes")
		List<Comparable> li = new LinkedList<Comparable>();
		for (int i = 0; i < 5; i++) {
			li.add(i);
		}
		System.out.println(li);
		li.add(3, "a100");
		System.out.println(li);
		li.set(4, "b100");
		System.out.println(li);
		System.out.println(li.get(3));
		System.out.println(li.indexOf("a100"));
		li.remove(1);
		System.out.println(li);
		
		
	}

}
