import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }


    public static void task2 () {
        System.out.println("Задача 2");

        int[] arr = generateRandomArray();

        int minSum = 201_000;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current < minSum) {
                minSum = current;
            }
        }

        int maxSum = 99_000;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxSum) {
                maxSum = current;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSum + " рублей.");
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double averageExpensive = sum / 30;

        System.out.println("Средняя сумма трат за месяц составила " + averageExpensive + " рублей.");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}