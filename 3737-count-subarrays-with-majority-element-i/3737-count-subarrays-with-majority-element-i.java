class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length,res=0;
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(nums[i]==target)?1:-1;
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum>0){
                    res++;
                }
            }
        }
        return res;
    }
}