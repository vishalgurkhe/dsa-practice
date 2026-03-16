package adityavermadsa.binarysearch;

public class Largest {
	
	public static int largestElement(int[] arr) {
		int start=0,end=arr.length-1;
		int largest=arr[0];
		while(start<end) {
			int mid=(start+end)/2;
			System.out.println("Mid >> "+mid);
			if (arr[mid]>=arr[end]) {
				end=mid;
				largest=arr[mid];
				System.out.println("Largest element at index is "+mid);
				
			}
			else if (arr[mid]<arr[end]) {
				start=mid+1;
			}
			
		}
		if (arr[start]>largest) {
			largest=arr[start];
		}
		return largest;
	}
public static void main(String[] args) {
	int[] arr=new int[] {10,11,12,13,14,5,6,7,8,9};
	System.out.println(largestElement(arr));
}
	
}
