import java.util.*;
public class SwitchClean {
    public static void main(String[] args) {
        System.out.println("Choose option: ");

        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();

        switch (choice) {
            case "Pratim" -> System.out.println("I'm Pratim");
            case "Krittika" -> System.out.println("I'm Krittika");
            case "Atim" -> System.out.println("I'm Atim");
            case "Agneesh" -> System.out.println("I'm Agneesh");
            case "Sneha" -> System.out.println("I'm Sneha");
            default -> System.out.println("Dhali is not here");
        }
        sc.close();
    }
}
