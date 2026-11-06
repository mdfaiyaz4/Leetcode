class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        int curr = 0, count = 0,max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                curr = i;
                count = 0;
                while(set.contains(curr)){
                    count++;
                    curr += 1;
                    
                }
                max = Math.max(max,count);
            }
            
        }
        return max;
    }
}