class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int ans[]=new int[2];
        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum==target){
                ans[0]=low+1;
                ans[1]=high+1;
                return ans;
            }
            if(sum<target){
                low++;
            }else if(sum>target){
                high--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna