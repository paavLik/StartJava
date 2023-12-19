package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final int[] nums = new int[GuessNumber.NUM_ATTEMPTS];
    private final String name;
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public String getName() {
        return name;
    }

    public void addNum(int num) {
        nums[attempt++] = num;
    }

    public int getNum(int attempt) {
        return nums[attempt];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
    }
}