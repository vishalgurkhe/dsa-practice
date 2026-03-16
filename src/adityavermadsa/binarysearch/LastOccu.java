package adityavermadsa.binarysearch;

public class LastOccu {
	
	public static int findPlace(int[] arr,int target) {
		int start=0,end=arr.length-1;
		//int element=0;
		int pos=-1;
		
		if(target<arr[start]) return arr[start];
		
		if(target > arr[end]) return arr[end];
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			//If target is exists, then diff will be zerro , hence simply return
			if (target==arr[mid]) {
				return target; //or we can return arr[mid] as well
			}
			
			else if (target>arr[mid]) {
				start=mid+1;
			}
			
			else if (target<arr[mid]) {
				end=mid-1;
			}
		}
		System.out.println("pos >>>"+pos);
		
		pos=start;
		System.out.println("pos >>> "+pos);
		int n1=arr[pos]-target;
		int n2=target-arr[pos-1];
		System.out.println("n1 ...>"+n1+"   n2 >>>"+n2);
		
		//int res=(n1<=n2) ? arr[pos]:arr[pos-1];
		int res=(n2<=n1) ? arr[pos-1]:arr[pos];
		System.out.println("Result >> "+res);
		return res;
		 //start;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr=new int[] {2,4,6,9,10,12,14};
		System.out.println(LastOccu.findPlace(arr, 5));
	}

}
