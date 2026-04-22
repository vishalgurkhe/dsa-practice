package dsaPract;

import java.util.Iterator;

public class MoveZeroToEnd {
	
	public static int[] moveZero(int[] arr) {
		
		int right=0,left=0;
		
		while(left<arr.length) {
			if (arr[left]==0) {
				left++;
			}
			else {
				arr[right]=arr[left];
				right++;
				left++;
			}
		}
		
		System.out.println("right >>"+right);
		while(right<arr.length) {
			arr[right]=0;
			right++;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,0,0,4,5};
		int[] moveZero = MoveZeroToEnd.moveZero(arr);
		System.out.println("Result >>> ");
		for (int i = 0; i < moveZero.length; i++) {
			System.out.print("   "+moveZero[i]);
		}
		
	}

}
