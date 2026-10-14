class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;
        int max = 0;
        int ans[] = new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                if(num1[j] == num2[i]){
                
                    for(int k=i+1; k<m;k++){
                        if(num2[k] > num1[j] ){
                             ans[j] = num2[k];
                             break;
                        }
                    }
                    break;
                }
            }
        }
        return ans;
    }
}