
public class StringMethods {
	
	public static void main(String[] args) {
		
//		String [] words = {"funck", "chunck", "furry", "baconator"};
//		 
//		for(String w : words) {
//			
//			if(w.startsWith("fu")){
//			System.out.println(w + "starts with fu");
//			
//		}
//		
//		}	
//for(String w : words) {
//			
//			if(w.endsWith("unck")){
//			System.out.println(w + "ends with unck");
//			
//		}
//		
//		}
// How to find character and sub string in a string
		
		String s = "faizaghazifaizaghazi";
		
		System.out.println(s.indexOf('g',7));
		
		System.out.println(s.indexOf("fai",2));
		
		String a = "Cookie ";
		String b = "monster";
		
		System.out.println(a.concat(b));
		System.out.println(a.replace('C', 'M'));
		System.out.println(b.toUpperCase());
		
				}

}
