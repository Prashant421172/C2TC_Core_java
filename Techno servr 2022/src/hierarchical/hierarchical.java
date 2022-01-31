


// hierarchical inheritance

package hierarchical;


class parent{
	void laptop() {
		System.out.println("dell....");
	}
}

class prod extends parent{
	 void mobile() {
		 System.out.println("apple....");
		}
	}

class div extends parent{
	 void tab() {
		 System.out.println("samsung");
	 }
}

public class hierarchical {
	public static void main(String[] args) {
		div d=new div();
		d.laptop();
		d.laptop();
		d.tab();
	}

}
