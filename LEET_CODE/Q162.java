package LEET_CODE;

public class Q162 {
    public static void main(String[] args) {
        
    }
    
    public int findPeakElement(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid]>arr[mid+1]) {
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
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer

        return start; // start and end both are equal
    }

}
