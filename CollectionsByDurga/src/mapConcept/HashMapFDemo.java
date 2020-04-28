package mapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapFDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		
		m.put("Tara",100);
		m.put("Dua", 600);
		m.put("Faiza", 200);
		m.put("Emaan", 500);
		
		System.out.println(m); // {K=V, K=V......}
		System.out.println(m.put("Tara",700));
		Set s = m.keySet();
		System.out.println(s);// [K,K,K....]
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "...." + m1.getValue());
			if(m1.getKey().equals("Dua")) {
			  m1.setValue(1000);
				
			}
		}
		
		System.out.println(m);

	}

}
