class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        //Count total no. of 1's
        for(int num : nums){
            totalOnes += num;
        }

        //Edge cases
        if(totalOnes == 0 || totalOnes == n) return 0;

        int onesInWindow = 0;

        //Count 1's in the first window of size totalOnes
        for(int i = 0;i<totalOnes;i++){
            onesInWindow += nums[i];
        }

        int maxOnesInWindow = onesInWindow;

        //Slide the window and update max
        for(int i = 0;i<n;i++){
            onesInWindow = onesInWindow - nums[i] + nums[(i + totalOnes) % n];
            maxOnesInWindow = Math.max(maxOnesInWindow, onesInWindow);
        }

        return totalOnes - maxOnesInWindow;
    }
}
