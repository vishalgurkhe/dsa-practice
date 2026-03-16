package adityavermadsa.binarysearch;


public class Smallest {

	//logic is for finding smallest element in rotated sorted array.
	
	public static int smallestElement(int[] arr) {
		int start=0,end=arr.length-1;
		int smallest=arr[0];
		while(start<end) {
			int mid=(start+end)/2;
			System.out.println("Mid >> "+mid);
			if (arr[mid]>arr[end]) {
				start=mid+1;
				System.out.println("moving right");
				
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
		return smallest;
	}
	
	//For above code if we have to return the index of smallest element then we can return the value of start
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,11,12,13,14,4,5,6,7,8,9};
		System.out.println(smallestElement(arr));
	}
	
}
