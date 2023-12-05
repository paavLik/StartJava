package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        swap();
        multiplyElements();
        removeElements();
        printAlphabetLadder();
        fillUniqueNumbers();
    }

    private static void swap() {
        System.out.println("1. Реверс значений массива");
        int[] revers = {1, 7, 4, 5, 2, 6, 3};
        print("   До реверса: ", revers);
        int length = revers.length;
        for (int i = 0; i < length; i++) {
            int saveArr = revers[i];
            revers[i] = revers[--length];
            revers[length] = saveArr;
        }
        print("После реверса: ", revers);
    }

    private static void multiplyElements() {
        System.out.println("\n2. Произведение элементов массива");
        int[] multipliers = new int[10];
        for (int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }

        int result = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < multipliers.length - 1; i++) {
            result *= multipliers[i];
            sb.append((i == 1) ? multipliers[i] : " * " + multipliers[i]);
        }
        System.out.println(sb + " = " + result);
    }

    private static void removeElements() {
        System.out.println("\n3. Удаление элементов массива");
        double[] realNumbers = new double[15];
        int length = realNumbers.length;
        for (int i = 0; i < length; i++) {
            realNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        print(realNumbers);
        double middleCell = realNumbers[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (realNumbers[i] > middleCell) {
                realNumbers[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        print(realNumbers);
        System.out.println("Количество обнуленных ячеек - " + count);
    }

    private static void printAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) (i + 'A');
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[length - 1 - j]);
            }
            System.out.println();
        }
    }

    private static void fillUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            int randomNumber;
            do {
                randomNumber = generateRandomNumber(60, 99);
            } while (isUniqueNumber(randomNumber, uniqueNumbers));
            uniqueNumbers[i] = randomNumber;
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int saveNumber = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = saveNumber;
                }
            }
        }
        System.out.println(Arrays.toString(uniqueNumbers));
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void print(String description, int[] arr) {
        System.out.print(description);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", arr[i]);
        }
        System.out.println();
    }

    private static boolean isUniqueNumber(int numbers, int[] arr) {
        for (int i : arr) {
            if (i == numbers) return true;
        }
        return false;
    }
}