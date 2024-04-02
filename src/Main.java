import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int warmDays = 0;
        int maxWarmDays = 0;
        System.out.println("Введите количество рассматриваемых дней:");
        n = scanner.nextInt();
        int[] tempByDay = new int[n];
        System.out.println("Вводите температуру по дням:");
        for (int i = 0; i < n; i++) {
            tempByDay[i] = scanner.nextInt();
            if (tempByDay[i] > 0) {
                ++warmDays;
            } else {
                warmDays = 0;
            }
            maxWarmDays = Math.max(maxWarmDays, warmDays);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(tempByDay[i] + " ");
        }
        System.out.println("Максимальное количество дней оттепели = " + maxWarmDays);
    }
}