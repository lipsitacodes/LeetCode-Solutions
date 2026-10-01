class Solution {
    public List<Integer> findDuplicates(int[] a) {

        List<Integer> res = new ArrayList<>();
        int i = 0;

        while (i < a.length) {

            int correctIndex = a[i] - 1;

            if (a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                res.add(a[i]);
            }
        }

        return res;
    }
}