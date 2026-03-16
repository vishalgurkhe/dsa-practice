package adityavermadsa.binarysearch;

public class NextLetter {
	
	public static char findNextLetter(char[] arr, char target){
		
		if (target>=arr[arr.length-1]) {
			return arr[0];
		}
		
		int start=0, end=arr.length-1;
		
		
		while (start<=end) {
			int mid=(start+end)/2;
			/*
			 * if(target==arr[mid]) { //return arr[mid+1]; //here we are doing like this bcz
			 * if we found repeated element we just move to next element start=mid+1; }
			 */
			//we taken both coditions as == and >
			if (target>=arr[mid]) {
				
				start=mid+1;
			}
			if (target< arr[mid]) {
				end=mid-1;
			}
			System.out.println("start >> "+start);
			System.out.println("mid >> "+mid);
			System.out.println("end >> "+end);
		}
		System.out.println("start >> "+start);
		//System.out.println("pos >> "+pos);
		return arr[start];
		
	}
	
	public static void main(String[] args) {
		char[] arr=new char[]{'a','a','a','a','a','c','d','g','j','l','o'};
		char nextLetter = NextLetter.findNextLetter(arr, 'a');
		System.out.println((char)nextLetter);
	}

}
