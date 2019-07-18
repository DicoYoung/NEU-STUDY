package Collections;

import java.util.*;
public class Practice0902 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		@SuppressWarnings("unused")
		Map<Object, Object> m2 = new HashMap<Object, Object>();
		
		m1.put("One", new Integer(1));
		m1.put("Two", new Integer(2));
		m1.put("Three", new Integer(3));
		
//		System.out.println(m1.size());
//		System.out.println(m1);
//		System.out.println(m1.containsKey("4"));
////		System.out.println(m1);
//		System.out.println(m1.containsValue(3));
////		System.out.println(m1);
//		
//		m2.putAll(m1);
//		System.out.println(m2);
		
		Set<String> keyes = m1.keySet();
		Iterator<String> it = keyes.iterator();
		while(it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);         //返回KEY值
			System.out.println(m1.get(k)); //返回对应的Value
		}
	}

}
