package mapConcepts;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept  {
	public static void main(String[] args) {
		
	TreeMap<String, Integer> tm =   new TreeMap<String, Integer>();
		
		tm.put("A", 777);
		tm.put("D", 444);
		tm.put("B", 666);
		tm.put("D", 222);
		tm.put("D", 221);
		tm.put("E", 111);
		tm.put("C", 888);
		
		System.out.println(tm);
		
		for(Entry<String, Integer> m : tm.entrySet()) {
			System.out.println(m.getKey()+ "   " +m.getValue());
		}
		
		Set set = tm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+ " :  " +me.getValue());
		}
		
		System.out.println("Lower Key: " + tm.lowerKey("B"));
		System.out.println("is Empty :"  + tm.isEmpty());
		System.out.println("ceiling Entry : "  + tm.ceilingEntry("D"));
		System.out.println("Higher Entry : "  + tm.higherEntry("D"));
		
	}

}
