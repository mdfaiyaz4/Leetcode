class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        int low = 0, high = n-1;
        int fix = 0;
        for(int i=0; i<n-2;i++){
            fix = -a[i];
            low = i+1;high = n-1;
            if(i > 0 && a[i] == a[i-1]){
                continue;
            }
            while(low < high){
                if(a[low] + a[high] == fix){
                    list.add(Arrays.asList(a[i],a[low],a[high]));
                    low++;high--;
                    while(low < high && a[low] == a[low-1]){
                        low++;
                    }
                    while(low < high && a[high] == a[high+1]){
                        high--;
                    }
                }
                else if(a[low] + a[high] > fix){
                    high = high - 1;
                }
                else{
                    low++;
                }
            }
        }
        return list;
    }
}