class Solution {
    public int[] findErrorNums(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correctIndex = a[i]-1;
            if (a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] != j+1) {
                return new int[]  {a[j],j+1};
            }
        }

        return new int[]  {-1,-1};
    }
    
}