package LEET_CODE;

public class Q1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] num, int target) {
        int peak = PeakIndexInMountainArray(num);
        int firstTry = OrderAgnosticBSfun(num, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
        // Try to search in second half
        return OrderAgnosticBSfun(num, target, peak + 1, num.length - 1);

    }

    public static int PeakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You're in of decreasing part of array
                // This may be the answer but look left
                // This is why end != mid - 1
                end = mid;
            } else {
                // You'r are in Ascending part of array
                start = mid + 1;
                // Because we know that mid+1 element > mid element
            }
        }
        // In the end, start == end and pointing to
        // the largest number because of the 2 checks
        // Start and end are always trying max
        // element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one
        // because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the
        // best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line
        // that is the best possible answer

        return start; // start and end both are equal
    }

    static int OrderAgnosticBSfun(int[] arr, int target, int start, int end) {

        // find wether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}



// LEETCODE Version :

/*
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private int peakIndexInMountainArray(MountainArray mountainArr) {

        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {

        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

 */
