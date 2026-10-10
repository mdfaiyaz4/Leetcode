class Solution {
    public int subarraySum(int[] a, int k) {
        int n = a.length;int count = 0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
             sum = sum + a[i];
             int diff = sum - k;
            if(sum == k){
                count++;
            }
            
            if(map.containsKey(diff)){
                count+= map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}