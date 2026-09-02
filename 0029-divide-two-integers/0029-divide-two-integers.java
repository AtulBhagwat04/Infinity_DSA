class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna