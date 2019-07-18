package Collections;

import java.util.*;
public class PracticeSet01 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("a");
		s1.add("b");
		s1.add("c");
		
		s2.add("d");
		s2.add("a");
		s2.add("b");
		
		Set<String> an = new HashSet<String>(s1);
		System.out.println(an);
		an.retainAll(s2);
		System.out.println(an);
		
		HashSet<String> hashSet = new HashSet<String>(s1);
		Set<String> su = hashSet;
		su.addAll(s2);
		System.out.println(su);
		
	}

}
