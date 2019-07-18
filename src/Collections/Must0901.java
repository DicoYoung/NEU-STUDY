package Collections;

import java.util.*;
public class Must0901 {

	List<Object> l;
	
	Must0901(){
		l = new LinkedList<Object>();
	}
	public void put(Object o) {
		l.add(o);
	}
	public Object get() {
		Object o = l.get(0);
		l.remove(0);
		return o;
	}
	public boolean isEmpty() {
		if(l.isEmpty()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Must0901 l = new Must0901();
		l.put("John1");
		l.put("Tom2");
		l.put("Mary3");
		
		while(!l.isEmpty()) {
			System.out.println(l.get());
		}
	}
}
