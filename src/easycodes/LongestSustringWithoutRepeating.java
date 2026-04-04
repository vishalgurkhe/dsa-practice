package easycodes;

import java.util.HashMap;

public class LongestSustringWithoutRepeating {

	public static int longestSubstring(String str) {

		int l = 0, r = 0;
		int maxlen = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();
		while (r < charArray.length) {
			System.out.println("l>>" + l + " r >>" + r);
			System.out.println("maxlen " + maxlen);

			// if window has repeating element then we move left pointer.
			if (map.containsKey(charArray[r])) {
				Integer integer = map.get(charArray[r]);
				if (l <= integer) {
					l = integer + 1;
				}

			}

			//Adding value in Hashmap of right 
			//if already exists , update orelse add new entry
			map.put(charArray[r], r);

			int len = r - l + 1;
			
			if (len > maxlen) {
				maxlen = len;
			}

			r++;

		}

		System.out.println(maxlen);

		return maxlen;

	}

	public static void main(String[] args) {
		System.out.println(longestSubstring("cadbzabcd"));
	}

}
