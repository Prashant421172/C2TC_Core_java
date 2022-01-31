package polymorphism;

public class Method_Overloading {
//	public void m() {
//		System.out.println("No Parameters");
//	}
	public void m(Object o) {
		System.out.println("Object class");
	}
	public void m(String s) {
		System.out.println("String class");
	}
	public void m(StringBuffer s) {
		System.out.println("StringBuffer class");
	}

//	public void m(int i) {
//		System.out.println("I am Integer Method");
//	}
//
//	public void m(double d) {
//		System.out.println("I am Double Method");
//	}

	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.m(new StringBuffer("Avantika"));
//		obj.m(null);
		
		
//		obj.m();
//		obj.m(6);
//		obj.m(5.76);
//
//		obj.m('a');
//		obj.m(4l);
//		obj.m(3.87f);
//		obj.m(3);
	}

}
