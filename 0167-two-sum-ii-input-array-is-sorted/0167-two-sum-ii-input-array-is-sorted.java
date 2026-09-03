class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;

        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }
            if(sum>target)
                high--;
            else if(sum<target)
                low++;
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna