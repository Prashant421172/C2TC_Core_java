


// Multilevel inheritance
package demo;

class parent{
	void laptop(){
		System.out.println("dell....");
	}	
}

 class prod extends parent{
	 void mobile() {
		 System.out.println("apple....");
		}
	}
 class div extends prod{
	 void tab() {
		 System.out.println("samsung....");
	 }
 }
	 
 
public class sinngll{
	
	public static void main(String[] args) {
		div d=new div();
		d.mobile();
		d.laptop();
		d.tab();
	}

}