class Solution {
    public int countCommas(int n) 
    {
        int count=0;
        for(int i=1;i<=n;i++){
            if(i>=1000){
                int digit=String.valueOf(i).length();
                count=count+(digit-1)/3;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna