class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int ans[] = new int[n];
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && a[i] > a[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = i - prev; 
            }
            stack.push(i);
        }
        return ans;
    }
}