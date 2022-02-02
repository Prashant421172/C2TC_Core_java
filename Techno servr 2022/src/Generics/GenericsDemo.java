package Generics;

public class GenericsDemo {

	public static void main(String[] args) {
		
		container<Float> obj= new container<>();
		obj.value=20.0f;
		obj.show();

	}

}

	class container<T>
	{
	T value;
	public void show()
	{
		System.out.println(value.getClass().getName());	
	}
	}
	