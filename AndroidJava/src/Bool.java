import java.util.Scanner;

public class Bool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDay = scanner.nextBoolean();
        boolean isGoodWeather = scanner.nextBoolean();
        if (isDay && isGoodWeather) {
            System.out.println("Я иду гулять");
        }

        if (isDay && !isGoodWeather) {
            System.out.println("Я читаю книгу");
        }

        if (!isDay) {
            System.out.println("Я сплю");
        }
    }
}
