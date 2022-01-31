package wrapper;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Wrapper {
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
//		ArrayList l = new ArrayList();
//		Integer i = new Integer(10);
//		l.add(i);

//		Float l = new Float(8.7f);
//		Float l = new Float(8.7d);
//		Float l = new Float("Avantika");// Runtime Exception

//		System.out.println(l);

		Boolean b = new Boolean("YES");
		Boolean c = new Boolean("NO");
		Boolean a = new Boolean("TRUE");
		Boolean d = new Boolean(false);

		System.out.println("a :" + a);
		System.out.println("d :" + d);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b.equals(c));// Content Comparison

	}
}
