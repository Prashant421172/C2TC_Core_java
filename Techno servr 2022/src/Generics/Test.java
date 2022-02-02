
			//bounded


package Generics;

public class Test {
	
	public static void main(String args []) {
		
	//	Fest<Integer> t1= new Fest<Integer>();
		Fest<String> t2= new Fest<String>();
		
		t2.value="ss";
		t2.show();
	}

}
class Fest<T extends String>{
	T value;
	public void show() {
	System.out.println(value.getClass().getName());
	}
	
	public static void main(String args []) {
		
		//Fest<Float> t1= new Fest<Float>();
		Fest<String> t2= new Fest<String>();
	}
}