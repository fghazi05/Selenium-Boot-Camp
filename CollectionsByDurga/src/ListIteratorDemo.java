import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Tara");
		l.add("Emaan");
		l.add("Dua");
		l.add("Kiran");
		l.add("Sarah");
		System.out.println(l);
		 
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			if(s.equals("Tara")) {
			ltr.remove();
		}
			else if(s.equals("Sarah")) {
				ltr.add("Kay");
			}
			else if(s.equals("Kiran")) {
				ltr.set("Hira");
			}
		}
		System.out.println(l);
	}
	

}
