class Solution {
    public long countCommas(long n) 
    {
        long comma=0;
        long commaBoundary=1000;
        while(n>=commaBoundary){
            long count=n-commaBoundary+1;
            comma=comma+count;
            commaBoundary=commaBoundary*1000l;
        }
        return comma;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna