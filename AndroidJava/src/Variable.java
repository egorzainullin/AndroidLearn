public class Variable {
    public static void main(String[] args) {
        int days = 10_000;
        int years = days / 365;
        int months = days % 365 / 30;
        int otherDays = days % 365 - (days % 365 / 30) * 30;
        System.out.println(years);
        System.out.println(months);
        System.out.println(otherDays);
        System.out.println(years * 365 + months * 30 + 25);
    }
}
