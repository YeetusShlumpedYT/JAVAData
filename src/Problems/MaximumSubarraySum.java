package Problems;

public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0){
            //handle edge cases
            return 0;
        }
        int currentSum = arr[0];
        int maxSum = arr[0];

        //Iterate through the array from the second element
        for(int i = 1;i<arr.length;i++){
            //update the current sum to be the maximum of the current element
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            //update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;  // Placeholder, replace with the actual result
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr1));  // Expected output: 6

        int[] arr2 = {1, 2, -1, 2, -3, 2, -5};
        System.out.println(maxSubarraySum(arr2));  // Expected output: 4

        int[] arr3 = {-1, -2, -3, -4};
        System.out.println(maxSubarraySum(arr3));  // Expected output: -1
    }
}