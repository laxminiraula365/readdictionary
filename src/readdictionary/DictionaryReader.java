package readdictionary;
import java.io.File;


public class DictionaryReader {
   
        public static void main (String[] args) {
			String filePath ="C:\\Users\\Niraj Thapa\\eclipse-workspace\\readdictionary";


			if (doesFileExist(filePath)) {
				System.out.println("File exists at path: " + filePath);
			} else {
				System.out.println("File does not exist at path: " + filePath);
			   }
			     }
		
       public static boolean doesFileExist(String filePath)   {
			try {
				File file = new File(filePath);
				return file.exists();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				 }
        }
}
		 
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
