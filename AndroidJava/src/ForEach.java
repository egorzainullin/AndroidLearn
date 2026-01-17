public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 100; i < 199; i++) {
            arr[i - 100] = i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
