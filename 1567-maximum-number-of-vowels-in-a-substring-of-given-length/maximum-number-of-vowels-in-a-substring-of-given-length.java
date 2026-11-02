class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0; int count = 0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'||ch == 'u'){
                count++;
            }
        }
        max = count;
        for(int i=k; i<n;i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-k);
            if(isvowel(ch)){
                count++;
            }
            if(isvowel(ch1)){
                count--;
            }
            max = Math.max(count,max);

        }
        return max;
    }
    public static boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'||ch == 'u'){
                return true;
            }
            return false;
    }
}