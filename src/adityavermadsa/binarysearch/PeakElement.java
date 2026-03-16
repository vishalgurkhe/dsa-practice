package adityavermadsa.binarysearch;

class PeakElement {
    public static int findPeakElement(int[] nums) {

        int start=0, end=nums.length-1;
        //in a while loop we not considering <= condition ,bcz we might cause ARrayIndexOutOfBounds exception
        while(start<end){
            int mid=(start+end)/2;

            //Peak element is in left or at mid
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }

            //Peak element is in right
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
        return start;
        //here we can return end as well bcz both the values can be same when loop exits
    }
    
    public static void main(String[] args) {
    	int[] nums = {1, 3, 5, 4, 2};  // Example array
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element is at index: " + peakIndex);
        System.out.println("Peak element value: " + nums[peakIndex]);
	}
}