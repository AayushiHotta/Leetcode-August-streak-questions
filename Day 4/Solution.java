import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        // Create an array to store all possible subarray sums
        int[] arr = new int[n * (n + 1) / 2];

        // Generate all subarray sums and store them in the array
        for (int i = 0, k = 0; i < n; ++i) {
            int s = 0; // Initialize the subarray sum
            for (int j = i; j < n; ++j) {
                s += nums[j]; // Add the current element to the subarray sum
                arr[k++] = s; // Store the subarray sum in the array
            }
        }

        // Sort the array of subarray sums
        Arrays.sort(arr);

        int ans = 0; // Initialize the answer
        final int mod = (int) 1e9 + 7; // Define the modulo value to avoid overflow

        // Sum up the elements in the specified range (1-based index)
        for (int i = left - 1; i < right; i++) {
            ans = (ans + arr[i]) % mod; // Add the current element to the answer and take modulo
        }

        return ans; // Return the final answer
    }
}
