package LEET_CODE;

// AMAZON AND GOOGLE QUESTION
public class Q33 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2 };
        // int target = 6;
        int ans = FindPivot(arr);
        System.out.println("Result is : " + ans);
    }
    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);

        if (pivot == -1) {
            // Just do normal binary search
            return Binary(nums, target, 0, nums.length - 1);
        }

        // If pivot found you have 2 asc sorted arrays

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return Binary(nums, target, 0, pivot-1);
        }

        return Binary(nums, target, pivot + 1, nums.length - 1);
    }


    public static int FindPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int Binary(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target>arr[mid]) {
                start = mid + 1;
            }
            else if (target<arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
