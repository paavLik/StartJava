package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        swap();
        multiplyArrayElements();
        removeArrayElements();
        printAlphabetLadder();
        fillArrayRandomNumbers();
    }

    public static void swap() {
        printTask("1. Реверс значений массива");
        int[] intArray = {1, 7, 4, 5, 2, 6, 3};
        printArray("   До реверса: ", intArray);
        int length = intArray.length; // 7
        for (int i = 0; i < length / 2; i++) {
            int saveArr = intArray[i];
            intArray[i] = intArray[length - 1 - i];
            intArray[length - 1 - i] = saveArr;
        }
        printArray("После реверса: ", intArray);
    }

    public static void multiplyArrayElements() {
        printTask("\n2. Произведение элементов массива");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int result = 1;
        StringBuilder out = new StringBuilder();
        for (int i = 1; i < array.length - 1; i++) {
            result *= array[i];
            out.append((i == 1) ? array[i] : " * " + array[i]);
        }
        System.out.println(out + " = " + result);
    }

    public static void removeArrayElements() {
        printTask("\n3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        int len = doubleArray.length;
        for (int i = 0; i < len; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        showArray(doubleArray);
        double middleCell = doubleArray[len / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (middleCell < doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println();
        System.out.println("Измененный массив: ");
        showArray(doubleArray);
        System.out.println("Количество обнуленных ячеек - " + count + "\n");
    }

    public static void printAlphabetLadder() {
        printTask("\n4. Вывод алфавита лесенкой");
        char[] arrayChar = new char[26];
        int length = arrayChar.length;
        for (int i = 0; i < length; i++) {
            arrayChar[i] = (char) (i + 'A');
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrayChar[length - 1 - j]);
            }
            System.out.println();
        }
    }

    public static void fillArrayRandomNumbers() {
        printTask("\n5. Заполнение массива уникальными числами");
        int[] array = new int[30];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int tmp;
            do {
                tmp = getIntFromRange(60, 99);
            } while (isExistArray(tmp, array));
            array[i] = tmp;
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static int getIntFromRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void printTask(String name) {
        System.out.println(name);
    }

    private static void printArray(String description, int[] arr) {
        System.out.print(description);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static void showArray(double[] arr) {
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