class Solution {
    public boolean checkIfPangram(String s) {
        int n = s.length();
        int a[] = new int[26];
        Arrays.fill(a,0);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            a[ch - 'a']++;
        }
        for(int i : a){
            if(i == 0){
                return false;
            }
        }
        return true;
    }
}