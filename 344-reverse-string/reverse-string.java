class Solution {
    public static void rev(int l, int r, char ch[]){
        if(l >= r) return;
        if(l < r){
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;
            rev(l+1,r-1,ch);
        }
    }
    public void reverseString(char[] s) {
         rev(0,s.length-1, s);
    }
}