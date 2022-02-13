package Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 
{
	//public static void main(String args[]) 
	{
		List <Integer> orig= List.of(13,20,25,15,18,28,36,33,39,58);
		System.out.println(orig);
	
	List<Integer> even= new ArrayList<>();
	for(Integer i: orig)
	{
		if(i%2==0) 
		{
			even.add(i);
		}
	}
		System.out.println(even);
		
		Stream<Integer> stream =orig.stream();
		List<Integer> l=stream.filter(i->i%2==0).collect(Collectors.toList()); //using stream reduce length of code
		System.out.println(l);
	}
	}
