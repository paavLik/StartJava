package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final int[] numbers = new int[GuessNumber.numberAttempts];
    private final String name;
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getLastNumber() {
        if (attempts == 0) {
            throw new IllegalStateException("Попыток еще не было!");
        }
        return numbers[attempts - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void addNumber(int number) {
        numbers[attempts++] = number;
    }

    public void clear() {
        Arrays.fill(numbers, 0, numbers.length, 0);
        attempts = 0;
    }
}