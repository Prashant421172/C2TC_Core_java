


// Static keyword program//

public class staticc {
	
	int empid;
	String name;
	//Here created static keyword to access a company name for all employ in company
	static String  company="Capgemini(TNS))";
	
	staticc(int empid, String name)
	{
	this.empid=empid;
	this.name=name;
	
	}
	
	void display()
	{
		
		System.out.println(empid+" " +name+" " +company);
		
	} 

	public static void main(String[] args)
	
	{
		staticc s1=new staticc(421,"Prash");
		staticc s2=new staticc(422,"KB");
		
		s1.display();
		s2.display();
	}
}
	
	
	
	
	 
	
	
	
