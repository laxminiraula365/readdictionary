package readdictionary;

import java.util.HashMap;
import java.util.Map;

public class Readword {
	

	public static void main(String[] args) {
		findMeaning("apple");
		findMeaning("table");
		
}
    public static void findMeaning(String str) {
		Map<String, String> list = new HashMap<String, String>();
		list.put("apple", "a fruit , a tech firm");
		list.put("table", "an object , containt row and column");
		

		String meaning = (String) list.get(str);
		String[] meaningarg = meaning.split(",");

		System.out.print(str + " : \n");
		for (int i = 0; i < meaningarg.length; i++) {
			System.out.println("meaning : " + meaningarg[i]);

		}

	}
}	
