package adityavermadsa.binarysearch;

import java.util.Iterator;

public class MonotonicArray {
	
	//Array is always sorted either ascending or desending
	//returns true if array is ascending ordder sorted or all elements are equal. if it is decendin returns false
	public static boolean isAscendingSorted(int[] arr) {
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i]>arr[i+1]) {
				return false;
			}
			if (arr[i]<arr[i+1]) {
				return true;
			}	
		}
		return true;
	}
	
	//returns the index if the match found or -1 otherwise
	public static int searchElement(int[] arr,int target) {
		
		//here we first check if array is sorted ascending or not
		boolean ascendingSorted = isAscendingSorted(arr);
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				return mid;
			}
			else if ( (ascendingSorted==true) && (target>arr[mid])) {
				System.out.println("array sorted ascendig and target is greater so we move to right");
				start=mid+1;
			}
			
			else if ( (ascendingSorted==true) && (target<arr[mid])) {
				System.out.println("array sorted ascendig and target is smaller so we move to left");
				end=mid-1;
			}
			
			else if ( (ascendingSorted==false) && (target<arr[mid])) {
				System.out.println("array sorted desending and target is smaller so we move to right");
				start=mid+1;
			}
			else if((ascendingSorted==false) && (target>arr[mid])) {
				System.out.println("array sorted desending and target is greater  so we move to left");
				end=mid-1;
			}
			System.out.println("start    "+start+"     end "+end);
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {


		;
	}

}
