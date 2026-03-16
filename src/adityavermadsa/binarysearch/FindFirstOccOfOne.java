package adityavermadsa.binarysearch;

public class FindFirstOccOfOne {
	
	//logic to find the first occurance of 1 in binary sorted array
	public static int findOccurance(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int startPos=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if (arr[mid]==target) {
				startPos=mid;
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
		}
		return startPos;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {0,0,0,0,1,1,1,1,1,1};
		System.out.println(FindFirstOccOfOne.findOccurance(arr, 1));
	}

}
