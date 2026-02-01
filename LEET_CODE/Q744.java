package LEET_CODE;
// Find Smallest Letter Greater Than Target
public class Q744 {
    public static void main(String[] args) {
        char[]  LettersArr = {'c','f','j'};
        char target = 'i';
        char ans = nextGreatestLetter(LettersArr, target);
        System.out.println("Answer is : " + ans);
    }

    public static char nextGreatestLetter(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}