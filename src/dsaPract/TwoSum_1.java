package dsaPract;

import java.util.HashMap;
import java.util.Iterator;

public class TwoSum_1 {
	
	public static int[] twoSum(int[] arr,int target) {
		
		int[] resultArr=new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		
		int index=0;
		for(int i=index+1;i<arr.length;i++) {
			int secElement=target-arr[index];
			System.out.println("Iteration in i + "+i+"   index "+index);
			System.out.println("arr[index] ="+arr[index]+"  secEelement ="+secElement);
			
			if (hashMap.containsKey(secElement)) {
				resultArr[0]=hashMap.get(secElement);
				resultArr[1]=i;
				return resultArr;
			}
			hashMap.put(secElement, i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {2,7,9,11};
		
		int[] twoSum = twoSum(arr, 16);
		
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}

}
