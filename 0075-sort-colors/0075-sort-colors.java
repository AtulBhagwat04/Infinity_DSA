class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++; mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna