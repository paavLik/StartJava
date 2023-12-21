package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] nums;
    private int attempt;

    public Player(String name) {
        this.name = name;
        nums = new int[10];
    }

    public void addNum(int num) {
        nums[attempt++] = num;
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public String toString() {
        return name;
    }
}