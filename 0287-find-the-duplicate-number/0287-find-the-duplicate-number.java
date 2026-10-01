class Solution {
    public int findDuplicate(int[] a) {
        int i = 0;
        while (i < a.length) {
            if(a[i] != i+1){
            int correctIndex = a[i] - 1;
            if (a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                return a[i];
            }
            }else{
                i++;
            }
        }
        return -1;
    }
}