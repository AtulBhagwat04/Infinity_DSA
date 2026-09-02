class Solution 
{
    public int subarraysDivByK(int[] nums, int k) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,sum=0;
        for(int i:nums){
            sum=(sum+i)%k;
            if(sum<0){
               sum=sum+k;
            }
            count=count+map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna