package striver;

import java.util.Iterator;

public class SortedOrNot {

	static boolean sortedArray(int[] arr){
		boolean result=true;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i+1]<arr[i]) {
				result=false;
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {10,11,12,13,14,15,1};
		boolean sortedArray = sortedArray(arr);
		System.out.println(sortedArray);
		
	}
	
}
