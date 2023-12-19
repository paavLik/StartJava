package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    public static final int NUM_ATTEMPTS = 10;
    private final Player player1;
    private final Player player2;
    private int hiddenNum;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("У каждого игрока по " + NUM_ATTEMPTS + " попыток ");
        init();
        do {
            inputNum(player1);
            if (isCheckNum(player1)) {
                break;
            }
            inputNum(player2);
        } while (!isCheckNum(player2) && player2.getAttempt() < NUM_ATTEMPTS);
        printPlayerNum(player1);
        printPlayerNum(player2);
    }

    private void init() {
        player1.setAttempt(0);
        player2.setAttempt(0);
        player1.clear();
        player2.clear();
        hiddenNum = (int) ((Math.random() * 100) + 1);
    }

    private void inputNum(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.addNum(scanner.nextInt());
    }

    private boolean isCheckNum(Player player) {
        int attempt = player.getAttempt() - 1;
        int num = player.getNum(attempt);
        String name = player.getName();
        if (num == hiddenNum) {
            System.out.println("Игрок " + name + " угадал число " + hiddenNum
                    + " c попытки № " + player.getAttempt());
            return true;
        }
        if (num > hiddenNum) {
            System.out.println(name + ", введенное число больше загаданного");
        } else if (num < hiddenNum) {
            System.out.println(name + ", введенное число меньше загаданного");
        }
        if (player.getAttempt() == NUM_ATTEMPTS) {
            System.out.println("У игрока " + name + " закончились попытки");
        }
        return false;
    }

    private void printPlayerNum(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}