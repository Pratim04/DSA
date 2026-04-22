class Divisor {
    public static void main(String[] args) {
        int num = 6;
        int result[] = divisors(num);

        for (int j = 0; j < result.length; j++) {
            if (result[j] != 0) {
                System.out.printf("%d", result[j]);
            }
        }
    }
    public static int[] divisors(int n) {
        int i = 1;
        int c=0;
        // int size = n/2;
        int arr[] = new int[n];

        while(i < n) {
            if(n % i == 0) {
                arr[c] = i;
                c++;
            }
            i++;
        }
        return arr;
    }
}