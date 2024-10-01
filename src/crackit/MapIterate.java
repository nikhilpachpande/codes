package crackit;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
	
	
	public static void main(String[] args) {
		
		MapIterate i = new MapIterate();
		
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(10, 20);
		
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		
		
	}

}
