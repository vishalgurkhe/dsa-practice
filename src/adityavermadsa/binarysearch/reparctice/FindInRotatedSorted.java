package adityavermadsa.binarysearch.reparctice;

public class FindInRotatedSorted {
	

	public int findSmallestPosition(int[] arr, int search) {
		
		int start=0;
		int end=arr.length-1;
		int smallestIndex=0;
		
		while (start<end) {
			
			int mid=(start+end)/2;
			if (arr[mid]<arr[end]) {
				System.out.println("Goint left side ");
				end=mid;
				smallestIndex=mid;
			}	
			else if(arr[mid]>arr[end]) {
				System.out.println("Going right side");
				start=mid+1;
			}
			
		System.out.println("Smallest idx >>"+smallestIndex);	
		}
		
		System.out.println("Smallest inddex is "+smallestIndex);
		
//we got smallest no idx , now we will search the no based on index
//		int search=7;
		if (search>=arr[smallestIndex] && search<arr[arr.length-1]) {
			start=smallestIndex;
			end=arr.length-1;
			
		}
		else {
			start=0;
			end=smallestIndex-1;
		}
		int mid=0;
		while(start<end) {
			mid=(start+end)/2;
			if (arr[mid]==search) {
				return mid;
			}
			else if (search > arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
			
		}
		System.out.println("search element position is "+mid);
		return mid;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,11,12,13,14,15,16,17,18,4,5,6,7,8,9};
		FindInRotatedSorted sm2=new FindInRotatedSorted();
		System.out.println(sm2.findSmallestPosition(arr,17));
	}

}
