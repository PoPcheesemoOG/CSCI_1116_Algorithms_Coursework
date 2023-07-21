package f;

import java.util.*;

public class Exercise21_07 {
	
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new HashMap<>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		List<WordOccurrence> list = new ArrayList<WordOccurrence>();
		
		map.forEach((key,value) -> {
			WordOccurrence wordOccurrence = new WordOccurrence();
			wordOccurrence.setCount(value);
			wordOccurrence.setWord(key);
			
			list.add(wordOccurrence);		
		});
		
		Collections.sort(list);
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("\n");
	}
}

//List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//
//list.sort((entry1, entry2)->
//entry1.getValue().compareTo(entry2.getValue()) == 0 ?
//		entry1.getKey().compareTo(entry2.getKey()) :
//			entry1.getValue().compareTo(entry2.getValue())
//);
//
//for(Map.Entry<String, Integer> entry: list) {
//System.out.println(entry.getKey() + "\t" + entry.getValue());
//}