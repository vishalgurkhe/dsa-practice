package adityavermadsa.binarysearch.reparctice;

public class Smallest2 {
	
	public int findSmallestPosition(int[] arr) {
		
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
		
		
		return smallestIndex;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {10,11,12,13,14,15,16,17,18,4,5,6,7,8,9};
		Smallest2 sm2=new Smallest2();
		System.out.println(sm2.findSmallestPosition(arr));
	}
	

}
