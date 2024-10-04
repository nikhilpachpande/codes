package crackit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapAccordingToValue {
	
	
	public static void main(String[] args) {
		
		
		Map<String , Integer> map = new HashMap<>();
		
		   map.put("a", 3);
	        map.put("b", 1);
	        map.put("c", 2);
		
	        Map<String , Integer> map1 =
	        		
	        		map.entrySet()
	        		.stream()
	        		.sorted(Entry.comparingByValue(Integer::compare))
	        		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new  ));
	        
	        //(e1, e2) -> e1 this tells in case of duplicate keys choose one value;
		
		System.out.println(map1);
		
		
		
	}

}
