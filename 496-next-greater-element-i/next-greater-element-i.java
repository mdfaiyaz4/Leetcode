class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums2){
            while(!stack.isEmpty() && stack.peek() < i){
                map.put(stack.pop() , i);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = map.get(nums1[i]);
        }
        return a;
    }
}