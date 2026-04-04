package dsaPract;

public class SearchPosition_66 {
	
	//Using Binary search  aptimized approach
	private int searchPosition(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int pos=arr.length;
		while(start<=end) {
			
			int mid=(start+end)/2;
			System.out.println("Mid .. >> "+mid);
			if (arr[mid]==target) {
				System.out.println("Match found");
				return mid;
			}
			else if (target<arr[mid]) {
				System.out.println("Returning to the left side ");
				end=mid-1;
				pos=mid;
			}
			else if (target >arr[mid]) {
				System.out.println("Returning to the right side ");
				start=mid+1;
			}
			
		}
		return pos;

	}
	
	public static void main(String[] args) {
		int[] numbers = {1,3,5,6};
		SearchPosition_66 sp=new SearchPosition_66();
		int searchPosition = sp.searchPosition(numbers, 2);
		System.out.println("Search Position >> "+searchPosition);
	}

}
