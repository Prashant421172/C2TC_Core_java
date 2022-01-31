package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("A");
		System.out.println(l);
		
		l.add(10);
		l.add("B");
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add("prashant");
		System.out.println(l);
	}

}
