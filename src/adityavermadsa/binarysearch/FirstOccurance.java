package adityavermadsa.binarysearch;

public class FirstOccurance {
	
	public static  int searchFirstOccurance(int[] arr,int target) {
		
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
	
	//This function returns last occurance of a given target
	public static  int searchLastOccurance(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int lastPos=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if (arr[mid]<=target) {
				lastPos=mid;
				start=mid+1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
		}
		return lastPos;
		
	}
	
	public static int[] firstAndLastOccurance(int[] arr,int target) {
		
		int start=0,end=arr.length-1,firstPos=-1,lastPos=-1;
		
		if (arr.length==0) {
			return new int[] {firstPos,lastPos};
		}
		
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				firstPos=mid;
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
		}
		
		start=0;
		end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]==target) {
				lastPos=mid;
				start=mid+1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
		}
		return new int[] {firstPos,lastPos};
	}
	
	public static void main(String[] args) {
		
		int[] arr=new int[]{10,11,12,13,14,14,14,14,15,16,17};
		//System.out.println(isAscendingSorted(arr));
		//System.out.println(searchFirstOccurance(arr, 14));
		
		//System.out.println(searchLastOccurance(arr, 14));
		
		int[] result = firstAndLastOccurance(arr, 12);
		System.out.println(result[0]+"    "+result[1]);
	}

}
