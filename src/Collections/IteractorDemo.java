package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteractorDemo {
    @SuppressWarnings("unchecked")
	public static void main(String[] args){
        @SuppressWarnings("rawtypes")
		Set s = new HashSet();
        for(int i = 0 ; i < 6 ; i++){
            s.add(i);
        }
        @SuppressWarnings("rawtypes")
		Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
            it.remove();
        }
        System.out.println(s);
    }
}
