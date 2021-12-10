package ru.skypro;

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

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println(" * Задача 1 ");
        for (int i : arr) {
            sum += i;
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублейю ");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        System.out.println(" * Задача 2 ");
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(" Минимальные затраты за день: " + min);
        System.out.println(" Максимальные затраты за день: " + max);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println(" * Задача 3 ");
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / (float) arr.length);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(" * Задача 4 ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
