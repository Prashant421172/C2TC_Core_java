
//********** 		 			Exception Handling(using throw)						**********

package Exception;
import java.util.Scanner;

public class CustomizeException {
	
	public static void main (String[] args)
	{
	 
		int money;
		System.out.println("Enter Your amount here to check you can buy or not:-");
		Scanner s=new Scanner(System.in);
		money=s.nextInt();
		
		if (money<100)
		{
			throw new Cantbuy (" Sorry you are not eligible yo buy chocolate");
		
		}
		else {
			System.out.println("Yess you can buy chocolate ......");
		}
	}
}

class Cantbuy extends RuntimeException {
	Cantbuy (String msg)
	{
		super (msg);
	}

}




