
//*************			// default constructor			***************

package constructor;

/*public class Test {
	int i;
	String s;

	public static void main(String[] args) {
		Test t= new Test();
		System.out.println(t.i);
		System.out.println(t.s);

	}

}*/

//*************			// No argument constructor		****************


/*public class Test {
	
	Test(){
		System.out.println("no argument constructor");
	}

	public static void main(String[] args) {
		Test t= new Test();

	}

}	*/


//*************			// parameterised constructor		****************

public class Test {
	
	Test(int a){
		System.out.println("parameterised constructor");
	}
	
	public static void main(String[] args) {
		Test t= new Test(25);
	}
}







