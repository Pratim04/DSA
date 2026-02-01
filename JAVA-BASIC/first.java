import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vafa");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Sum s1 = new Sum(n1);
        Sum s2 = new Sum(n2);
        s1.foo();
        s2.foo();
        sc.close();
    }
}
class Sum{ 
    int a;
    Sum(int a) {
        System.out.println("First exe");
        this.a = a;
    }
    void foo() {
        System.out.println(this.a);
    }
}