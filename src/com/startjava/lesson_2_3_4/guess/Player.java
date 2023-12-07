package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int attempts;
    private final int[] number = new int[GuessNumber.numberAttempts];

    public Player(String name) {
        this.name = name;
    }

    public int getNumber(int attempts) {
        return number[attempts];
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public int[] getNum() {
        return Arrays.copyOf(number, attempts);
    }

    public void addNumber(int num) {
        number[attempts] = num;
        attempts++;
    }

    public void resetNumber() {
        Arrays.fill(number, 0, attempts, 0);
    }

}
