package striver;

import java.util.HashMap;

public class LongSubArrWithSum {
	
	public static int longestSubArrayWithSum(int[] arr, int target) {
		
		int l=0,r=0;
		int sum=0;
		int maxLen=0;
		int leftSum=0;
		
		
		while(r<arr.length) {
			// Step 1: include current element
	        sum += arr[r];

	        // Step 2: shrink window
	        while (sum > target) {
	            sum -= arr[l];
	            l++;
	        }

	        // Step 3: check condition
	        if (sum == target) {
	            maxLen = Math.max(maxLen, r - l + 1);
	        }

	        r++;
		}
		
		return maxLen;
		
	}
	
//	Sol using Hashmap
	
public static int longestSubArrayWithSum2(int[] arr, int target) {
		
		int sum=0,len=0,maxLen=0;;
		HashMap< Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
			
			if(sum==target) {
				len=i+1;
			}
			else {
				int no=sum-target;
				if(map.containsKey(no)) {
					Integer integer = map.get(no);
					len=i-integer;
				}
			}
			
			if (len>maxLen) {
				maxLen=len;
			}
			
			//This if is for if there any no is zero , so sum is not changinging then it will overwrite the old index for the sum.
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
			
		}
		
		return maxLen;
	}

//optimized solution for positive nos.

public static int longestSubArrayWithSum3(int[] arr, int target) {
	
	int r=1,l=0,sum=arr[0],len=0,maxLen=0;
	
	while (r<arr.length) {
		
		while (l<=r && sum>target) {
			sum=sum-arr[l];
			l=l+1;
		}
		
		
		if (sum==target) {
			len=r-l+1;
		}
		
		if (len>maxLen) {
			maxLen=len;
		}
		
		r++;
		if (r<arr.length) {
			sum=sum+arr[r];
		}
		
	}
	
	return maxLen;
	
	
}
	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 3, 4, 5};
//	    int target = 9;
//
//	    int result = longestSubArrayWithSum(arr, target);
//
//	    System.out.println("Longest subarray length: " + result);
	    
	    int[] arr2= {1,2,3,1,1,1,1};
	    int t=3;
	    System.out.println(longestSubArrayWithSum3(arr2, t));
	}
}
