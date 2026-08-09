class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&& arr[i]>arr[stack.peek()]){
                int prev=stack.pop();
                ans[prev]=i-prev;
            }
            stack.push(i);
        }
        return ans;
    }
}