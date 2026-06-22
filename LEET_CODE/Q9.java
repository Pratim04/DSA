package LEET_CODE;
// Palindrome of a given number
public class Q9 {
    public void main(String[] args) {
        boolean ans = isPalindrome(-121);
        System.out.println(ans);
    }

    public boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        if (num<0) {
            return false;
        }
        else {
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            return original == rev;
        }
    }
}
