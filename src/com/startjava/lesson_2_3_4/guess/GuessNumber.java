package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int numberAttempts = 10;
    private int hiddenNumber;
    private final Player player1;
    private final Player player2;
    private Player curPlayer;
    private final Scanner scanner;
    private boolean isGameOver;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void start() {
        init();
        System.out.println("Игра началась! У каждого игрока по " + numberAttempts + " попыток.");
        while (!isGameOver) {
            inputNumber();
            checkNumber();
            changePlayer();
        }
        printPlayerNumber(player1);
        printPlayerNumber(player2);
    }

    private void init() {
        curPlayer = player1;
        curPlayer.setAttempts(0);
        curPlayer.resetNumber();
        hiddenNumber = (int) (Math.random() * 100 + 1);
        isGameOver = false;
    }

    private void inputNumber() {
        System.out.print(curPlayer.getName() + " введи число: ");
        curPlayer.addNumber(scanner.nextInt());
        System.out.println();
    }

    private void checkNumber() {
        int attemt = curPlayer.getAttempts() - 1;
        int number = curPlayer.getNumber(attemt);
        if (number == hiddenNumber) {
            System.out.println("Игрок " + curPlayer.getName() + " угадал число " + hiddenNumber + " c попытки № "
                    + curPlayer.getAttempts());
            isGameOver = true;
        }
        if (number > hiddenNumber) {
            System.out.println(curPlayer.getName() + ", введенное число больше загаданного");
        } else if (number < hiddenNumber) {
            System.out.println(curPlayer.getName() + ", введенное число меньше загаданного");
        }
        if (curPlayer.getAttempts() == numberAttempts) {
            System.out.println("У игрока " + curPlayer.getName() + " закончились попытки");
            isGameOver = true;
        }
    }

    private void changePlayer() {
        curPlayer = curPlayer == player1 ? player2 : player1;
    }

    private void printPlayerNumber(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + ": ");
        for (int num : player.getNum()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
