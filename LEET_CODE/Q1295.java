package LEET_CODE;
// Find Numbers with Even Number of Digits

class Q1295 {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896,51 };
        // Scanner in = new Scanner(System.in);

        // System.out.println("Enter 10 numbers: ");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        System.out.println(findNumbers(arr));;
        // in.close();
    }

    static int findNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOFdigits = digits2(num);
        if (numberOFdigits % 2 == 0) {
            return true;
        }
        return false;

        // return numberOFdigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}