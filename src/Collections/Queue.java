package Collections;

import java.util.*;
public class Queue extends LinkedList<Object> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void put(Object o) {
		this.addLast(o);
	}
	
	public Object get() {
		Object o = this.getLast();
		this.removeLast();
		return o;
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.put("one");
		q.put("two");
		q.put("three");
		q.put("four");
		
		System.out.println(q);
		System.out.println(q.get());
		System.out.println(q);
		System.out.println(q.get());
		
	}
	
}
