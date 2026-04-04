package dsaPract;

import java.util.Arrays;

class Solution {
	public int[] productExceptSelf(int[] nums) {

		int[] ans = new int[nums.length];

		int leftprod = 1;
		ans[0] = leftprod; // First element has no left product, so set to 1

		// 👉 First loop: store product of all elements to the left of each index
		for (int i = 1; i < nums.length; i++) {
			ans[i] = leftprod * nums[i - 1]; // product of all elements before i
			leftprod = ans[i]; // update leftprod for next iteration
		}

		int rightprod = 1;
		// 👉 Second loop: multiply each element with the product of elements to its
		// right
		for (int i = nums.length - 1; i >= 0; i--) {
			ans[i] = rightprod * ans[i]; // multiply left product (in ans) with right product
			rightprod = rightprod * nums[i]; // update right product for next iteration
		}

		// Return final answer array
		return ans;
	}
}

public class ProductExceptSelf_238 {

	public static void main(String[] args) {

		// Input array
		int[] nums = { 1, 2, 3, 4 };

		// Create object of Solution class
		Solution sol = new Solution();

		// Call the method
		int[] result = sol.productExceptSelf(nums);

		// Print the result
		System.out.println("Product of array except self: " + Arrays.toString(result));

	}

}
