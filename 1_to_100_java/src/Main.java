public class Main {
    public static void main(String args[]) {
        int n = 100;
        System.out.println("Четные числа в промежутке от 1 до 100: ");
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}