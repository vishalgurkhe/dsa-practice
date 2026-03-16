package adityavermadsa.binarysearch;

public class NearlySorted {
	
	public static int search(int[] arr,int target) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if(start<=mid-1 && arr[mid-1]==target) {
				return mid-1;
			}
			if (end>=mid+1 && arr[mid+1]==target) {
				return mid+1;
			}
			
			if(arr[mid]<target) {
				
				start=mid+2;
			}
			
			if(arr[mid]>target) {
				end=mid-2;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,11,12,15,14,16};
		System.out.println(search(arr, 14));
	}

}
