package in.ineuron.in;

public class MaximumCircularSubarraySum {

	
	    public static int maxSubarraySumCircular(int[] nums) {
	        int totalSum = 0; // Total sum of the array
	        int maxSum = Integer.MIN_VALUE; // Maximum subarray sum
	        int minSum = Integer.MAX_VALUE; // Minimum subarray sum
	        int currentMaxSum = 0; // Maximum sum of subarray ending at the current index
	        int currentMinSum = 0; // Minimum sum of subarray ending at the current index
	        
	        // Calculate the total sum and maximum subarray sum using Kadane's algorithm
	        for (int num : nums) {
	            totalSum += num;
	            currentMaxSum = Math.max(currentMaxSum + num, num);
	            maxSum = Math.max(maxSum, currentMaxSum);
	            currentMinSum = Math.min(currentMinSum + num, num);
	            minSum = Math.min(minSum, currentMinSum);
	        }
	        
	        // If the maximum subarray sum is negative, return it (all elements are negative)
	        if (maxSum < 0) {
	            return maxSum;
	        }
	        
	        // Calculate the maximum circular subarray sum by subtracting the minimum subarray sum from the total sum
	        int maxCircularSum = totalSum - minSum;
	        
	        // Return the maximum of the maximum subarray sum and maximum circular subarray sum
	        return Math.max(maxSum, maxCircularSum);
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, -2, 3, -2};
	        int maxSum = maxSubarraySumCircular(nums);
	        System.out.println("Maximum circular subarray sum: " + maxSum);
	    }
	}

