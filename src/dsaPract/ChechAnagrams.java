package dsaPract;

import java.util.HashMap;

public class ChechAnagrams {
	
	public static boolean checkIfAnagram(String s1, String s2) {
		
		if (s1.length()!=s2.length() ) return false;
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		//traverse first string and put the count in map
		for(Character ch:s1.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		
		//tran=verse 2nd string and reduce the count in map
		for(Character ch: s2.toCharArray()) {
			if (! map.containsKey(ch)) {
				return false;
			}
			else {
				map.put(ch, map.get(ch)-1);
			}
		}
		
		
		for(int val:map.values()) {
			if(val!=0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		boolean checkIfAnagram = ChechAnagrams.checkIfAnagram("lasten", "silent");
		System.out.println(checkIfAnagram);
	}

}
