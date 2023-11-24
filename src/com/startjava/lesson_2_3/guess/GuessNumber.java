package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

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
        System.out.println("Да начнется великая битва в Угадай число!!!");
        while (!isGameOver) {
            inputNumber();
            checkNumber();
            changePlayer();
        }
    }

    private void init() {
        curPlayer = player1;
        hiddenNumber = (int) (Math.random() * 100 + 1);
        isGameOver = false;
    }

    private void inputNumber() {
        System.out.print(curPlayer.getName() + " введи число: ");
        curPlayer.setNumber(scanner.nextInt());
        System.out.println();
    }

    private void checkNumber() {
        if (curPlayer.getNumber() > hiddenNumber) {
            System.out.println("Число " + curPlayer.getNumber() + " больше того, что загадал компьютер");
        } else if (curPlayer.getNumber() < hiddenNumber) {
            System.out.println("Число " + curPlayer.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(curPlayer.getName() + " Вы победили!");
            isGameOver = true;
        }
    }

    private void changePlayer() {
        curPlayer = curPlayer == player1 ? player2 : player1;
    }
}
