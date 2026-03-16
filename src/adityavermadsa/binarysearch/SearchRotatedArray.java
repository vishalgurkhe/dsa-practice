package adityavermadsa.binarysearch;

public class SearchRotatedArray {
	
	public static int searchPosition(int[] arr,int target) {
		int start=0,end=arr.length-1;
		int smallest=arr[0];
		int smallIndex=0;
		while(start<end) {
			int mid=(start+end)/2;
			System.out.println("Mid >> "+mid);
			if (arr[mid]>arr[end]) {
				start=mid+1;
				
			}
			else if (arr[mid]<=arr[end]) {
				smallest=arr[mid];
				
				end=mid;
				//smallest=arr[mid];
				System.out.println("Smallest element at index > "+mid);
			}
			
		}
		if (arr[start]<smallest) {
			smallest=arr[start];
			System.out.println("Smallest index at "+start);
		}
		
		smallIndex=start;
		start=0;
		end=arr.length-1;
		
		if (arr[smallIndex]==target) {
			return smallIndex;
		}
		else if (target>arr[smallIndex] && target<=arr[end]) {
			start=smallIndex+1;
		}
		else {
			end=smallIndex-1;
		}
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if (arr[mid]<target) {
				start=mid+1;
			}
			if (arr[mid]>target) {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,11,12,13,14,15,6,7,8,9};
		System.out.println(searchPosition(arr, 13));
	}

}
