import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 10) {
            System.out.println("pizza");
        } else if (a >= 6) {
            System.out.println("hamburger");
        } else {
            System.out.println("sandwich");
        }
    }
}
