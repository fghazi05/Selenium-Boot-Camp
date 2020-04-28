import java.io.File;   // To check if a file exists in the directory or not

public class FileExistence {
	public static void main(String[] args) {
		
	
	
	File f = new File("C://java//faiza.txt");
	
	if(f.exists())
		System.out.println(f.getName() +  "Exists!");
	
	else
		System.out.println("The file doesn't exst");
		
	
	}
}
