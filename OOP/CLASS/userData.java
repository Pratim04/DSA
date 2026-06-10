package OOP.CLASS;
import java.util.*;

public class userData {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student pratim = new Student();
        System.out.print("Enter a value: ");
        pratim.rno = sc.nextInt();
        System.out.print("Roll Number is : " + pratim.rno);
    }
}

class Student {
    int rno;
    String name;
    float marks;
}