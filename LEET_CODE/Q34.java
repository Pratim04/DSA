package LEET_CODE;
// Find First and Last Position
// of Element in Sorted Array
public class Q34 {
    public static void main(String[] args) {
        int[] num = { 5 ,7 ,7, 8 ,8 ,8 ,8 ,10 };
        int target = 8;
        int[] ans = searchRange(num, target);
        System.out.println("Result is : [" + ans[0] + " " + ans[1] + "]");
    }
    
    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) /2;

            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
