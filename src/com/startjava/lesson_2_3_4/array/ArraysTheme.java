package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        swap();
        multiplyElements();
        removeElements();
        printAlphabetLadder();
        fillRandomNumbers();
    }

    private static void swap() {
        printTask("1. Реверс значений массива");
        int[] reversArr = {1, 7, 4, 5, 2, 6, 3};
        print("   До реверса: ", reversArr);
        int length = reversArr.length;
        for (int i = 0; i < length; i++) {
            int saveArr = reversArr[i];
            reversArr[i] = reversArr[--length];
            reversArr[length] = saveArr;
        }
        print("После реверса: ", reversArr);
    }

    private static void multiplyElements() {
        printTask("\n2. Произведение элементов массива");
        int[] multiplicationArr = new int[10];
        for (int i = 0; i < multiplicationArr.length; i++) {
            multiplicationArr[i] = i;
        }

        int result = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < multiplicationArr.length - 1; i++) {
            result *= multiplicationArr[i];
            sb.append((i == 1) ? multiplicationArr[i] : " * " + multiplicationArr[i]);
        }
        System.out.println(sb + " = " + result);
    }

    private static void removeElements() {
        printTask("\n3. Удаление элементов массива");
        double[] deletionArr = new double[15];
        int length = deletionArr.length;
        for (int i = 0; i < length; i++) {
            deletionArr[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        print(deletionArr);
        double middleCell = deletionArr[length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (deletionArr[i] > middleCell) {
                deletionArr[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        print(deletionArr);
        System.out.println("Количество обнуленных ячеек - " + count);
    }

    private static void printAlphabetLadder() {
        printTask("\n4. Вывод алфавита лесенкой");
        char[] alphabetArr = new char[26];
        int length = alphabetArr.length;
        for (int i = 0; i < length; i++) {
            alphabetArr[i] = (char) (i + 'A');
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabetArr[length - 1 - j]);
            }
            System.out.println();
        }
    }

    private static void fillRandomNumbers() {
        printTask("\n5. Заполнение массива уникальными числами");
        int[] uniqueArr = new int[30];
        int length = uniqueArr.length;
        for (int i = 0; i < length; i++) {
            int saveNumber;
            do {
                saveNumber = getIntFromRange(60, 99);
            } while (isExistArray(saveNumber, uniqueArr));
            uniqueArr[i] = saveNumber;
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (uniqueArr[j] > uniqueArr[j + 1]) {
                    int tmp = uniqueArr[j];
                    uniqueArr[j] = uniqueArr[j + 1];
                    uniqueArr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(uniqueArr));
    }

    private static int getIntFromRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void printTask(String name) {
        System.out.println(name);
    }

    private static void print(String description, int[] arr) {
        System.out.print(description);
        for (int e : arr) {
            System.out.print(e + " ");
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

    private static boolean isExistArray(int numbers, int[] intArr) {
        for (int i : intArr) {
            if (i == numbers) return true;
        }
        return false;
    }
}