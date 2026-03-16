package adityavermadsa.binarysearch;

public class FloorOfElement {
	
	public static int floor(int[] arr, int target) {
		
		int start=0,end=arr.length-1;
		int floor=arr[0];
		
		//we r returning -1 if that target no is smaller than first element; in this case floor is not exist
		if(arr[0]>target) {
			return -1;
		}
		
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				floor=arr[mid];
				return floor;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
				floor=arr[mid];
			}
		}
		
		//System.out.println("Floor is >> "+floor);
		return floor;
	}
	
public static int ceil(int[] arr, int target) {
		
		int start=0,end=arr.length-1;
		int ceil=arr[0];
		
		//we r returning -1 if that target no is greater than last element; in this case floor is not exist
		if(arr[arr.length-1]<target) {
			return -1;
		}
		
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				ceil=arr[mid];
				return ceil;
			}
			else if(arr[mid]>target) {
				end=mid-1;
				ceil=arr[mid];
			}
			else {
				start=mid+1;
				
			}
		}
		
		//System.out.println("Floor is >> "+floor);
		return ceil;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[]{10,13,16,19,22,25};
		int floor = FloorOfElement.floor(arr, 28);
		System.out.println("Floor is "+floor);
		
		int ceil = FloorOfElement.ceil(arr, 8);
		System.out.println("Ceil is >>"+ceil);
	}

}
