package dsaPract;

import java.util.Iterator;

public class RemoveElement {
	
	public void printArray(int arr[]){
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("   "+arr[i]);
		}
		System.out.println();
	}
	
	public  int removeElement(int[] nums, int val) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                //match found do nothing
            	
            	System.out.println("Match not  found hence doing  something i "+i+"  index "+index);
            	
                nums[index]=nums[i];
                index++;
            }
            else {
            	System.out.println("Match found hence do nothing i "+i+"  index "+index);
            }    
        }
        return nums.length;
    }
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {3,2,2,3};
		
		RemoveElement re=new RemoveElement();
		
		int removeElement = re.removeElement(arr, 3);
		System.out.println("result >>> "+removeElement);
		
		re.printArray(arr);
		
	}

}
