package Collections;

import java.util.ArrayList;
import java.util.List;

public class Must0902 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(new Integer(1));
		l.add(new Integer(2));
		l.add(new Integer(3));
		l.add(new Integer(4));
		l.add(new Integer(5));

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
	}

}
