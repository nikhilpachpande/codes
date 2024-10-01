package crackit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;

public class SingleTonClass {
	
	public static void main(String[] args) {
		
//		SingleTonClass a = new SingleTonClass();
//		
//		Optional<SingleTonClass> b=Optional.ofNullable(null);
//		
		
//		b.orElseGet(null);
//		b.orElseThrow();
		
		Map<Integer,Integer> m = new HashMap<>();
		
		m.put(1,2);
		m.put(3, 3);
		
		Iterator itr =m.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
		}
		
		m.entrySet().forEach(System.out::println);
		
		
		// select *  from Employee order by Employee_salary desc limit(2,1);
		
		// seelct  * from Employeee Right Join Student on student = employee g
		
		
		String str = "nikhil";
		String str3 ="nikhil" ;
		
		String str1 = new String("nikhil");
		
		System.out.println(str==str1.intern());
		
		LinkedList<Integer> list = new LinkedList<>();
		
		
		
		
		
		
	}
	
	
	

	
	
	
}


	

