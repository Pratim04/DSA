class printName {
    public static void main(String[] args) {
        int num = 5;
        name(num);
    }

    public static void name(int n) {
        if (n == 0) return;

        System.out.print("Hello");
        name(n-1);
    }
}