class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] prod=new int[nums.length];
        prod[0]=1;
        for(int i=1;i<nums.length;i++){
            prod[i]=prod[i-1]*nums[i-1];
        }

        int temp=1;
        for(int i=nums.length-1;i>=0;i--){
            prod[i]=prod[i]*temp;
            temp=temp*nums[i];
        }
        return prod;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna