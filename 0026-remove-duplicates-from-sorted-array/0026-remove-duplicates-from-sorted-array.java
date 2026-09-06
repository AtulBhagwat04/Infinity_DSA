class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int ptr1=0;
        for(int ptr2=1;ptr2<nums.length;ptr2++){
            if(nums[ptr1]!=nums[ptr2]){
                nums[ptr1+1]=nums[ptr2];
                ptr1++;
            }
        }   
        return ptr1+1; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna