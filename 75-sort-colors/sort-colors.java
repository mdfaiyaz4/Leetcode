class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int z = 0,o = 0, t= 0;
        for(int i:a){
            if(i == 0) z++;
            else if(i == 1) o++;
            else if(i == 2) t++;
        } o +=z; t+=o;
        for(int i=0;i<z;i++){
            a[i] = 0;
        }
        for(int i=z;i<o;i++){
            a[i] = 1;
        }for(int i=o;i<t;i++){
            a[i] = 2;
        }
    }
}
