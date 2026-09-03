class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,k=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[k++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna