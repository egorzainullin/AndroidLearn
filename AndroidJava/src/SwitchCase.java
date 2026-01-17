public class SwitchCase {
    public static void main(String[] args) {
        String month = System.console().readLine();

        switch (month) {
            case "January", "February", "December":
                System.out.println("winter");
                break;
            case "March", "April", "May":
                System.out.println("spring");
                break;
            case "June", "July", "August":
                System.out.println("summer");
                break;
            case "September", "October", "November":
                System.out.println("autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
