class Solution {
    static int BS(int[] arr, int t, int l, int h) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int t) {
        int p = findPivot(arr);
        //if you don't found the pivot
        //just do normal binary search
        if (p == -1) {
            return BS(arr, t, 0, arr.length- 1) ;
        } if (arr[p] == t)
            return p;

        if (t >= arr[0]) {
            return BS(arr, t, 0, p);
        }else {
            return BS(arr, t, p + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            //Four cases over here
//            case : 1
            if (mid < h && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//            case : 2
            else if (mid > l && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            case : 3
            else if (arr[mid] <= arr[l]) {
                h = mid - 1;
            }
//            case : 4
            else {
                l = mid + 1;
            }
        }
        return -1;
    }
    }
