package Map;
import java.util.*;
public class Map_Interface {

	public static void main(String[] args) {
	
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('a', "Anil");
		map.put('b', "Babu");
		map.put('c', "Charan");
		map.put('d', "Dharani");
		map.put('e', "Eniyan");
		map.put('f', "ferina");
		System.out.println(map);
		map.remove('b','d');
		for(Map.Entry m:map.entrySet() )
		{
			
		System.out.println(m.getKey()+" "+m.getValue() );
		}
	}
}


