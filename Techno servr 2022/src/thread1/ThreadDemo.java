package thread1;

class MyThread implements Runnable{

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child Thread");
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread m =new MyThread();
		Thread t=new Thread(m);
		t.start();
		
		for(int i=0;i<=10;i++) 
		{
			System.out.println("Main Thread");
		}

	}

}
