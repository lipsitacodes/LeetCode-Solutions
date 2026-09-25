class Solution {
    public int missingNumber(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correctIndex = a[i];
            if (a[i] < a.length && a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
        }}
                for (int j = 0; j < a.length; j++) {
                    if (j != a[j]) {
                        return j;
                    }
                }
            
                return a.length;
    }
}