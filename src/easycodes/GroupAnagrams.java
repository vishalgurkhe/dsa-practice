package easycodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
	
	public static List<List<String>> findGroupAnagrams(List<String> list) {
		
		HashMap< String, List<String>> map=new HashMap<>();
		
		list.stream().forEach(str->{
			
			String sortedStr = str.chars().mapToObj(c->String.valueOf((char)c))
				.sorted()
				.collect(Collectors.joining(""));
			
			//we can use below logic for sorting as well.
//			char[] arr = str.toCharArray();
//			Arrays.sort(arr);
//			String sortedStr = new String(arr);
			
			if (map.containsKey(sortedStr)) {
				List<String> valueList = map.get(sortedStr);
				valueList.add(str);
			}
			
			else{
				ArrayList< String> list2=new ArrayList<>();
				list2.add(str);
				map.put(sortedStr, list2);
			}
			
		});
		
		System.out.println(map.toString());
		
//		<List<String>> values = map.values();
		
		return new ArrayList<>(map.values());
		
	}
	
    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat", "bat"
        );

        List<List<String>> result = GroupAnagrams.findGroupAnagrams(input);

        // Print result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

}
