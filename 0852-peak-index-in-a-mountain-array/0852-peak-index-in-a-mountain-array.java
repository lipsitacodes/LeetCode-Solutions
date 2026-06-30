class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            // You are in the decreasing part of the mountain
            if (arr[mid] > arr[mid + 1]) {
                h = mid;      // mid can be the answer
            }
            // You are in the increasing part of the mountain
            else {
                l = mid + 1;  // mid cannot be the answer
            }
        }
        return l;
    }
}