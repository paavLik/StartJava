package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int secretNum;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        secretNum = new Random().nextInt(1, 101);
        System.out.println("\nИгра началась! У каждого игрока по 10 попыток.");

        do {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        } while (player2.getAttempt() < 10);
        endGame();
    }

    private boolean isGuessed(Player player) {
        inputNum(player);
        boolean isEqual = compareNums(player);

        if (!isEqual && player.getAttempt() >= 10) {
            System.out.println("У " + player + " закончились попытки!");
            return isEqual;
        }
        return isEqual;
    }

    private void inputNum(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.print("\n" + player + ", введите число: ");
        player.addNum(console.nextInt());
    }

    private boolean compareNums(Player player) {
        int num = player.getNum();
        if (num == secretNum) {
            System.out.println("Игрок " + player + " угадал загаданное число" + num + " с " + player.getAttempt() + " попытки");
            return true;
        }
        if (num > secretNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void endGame() {
        printNums(player1);
        printNums(player2);
        System.out.println("\n");
        player1.clear();
        player2.clear();
    }

    private void printNums(Player player) {
        int[] nums = player.getNums();
        System.out.print("\nЧисла игрока " + player + ":");
        for (int num : nums) {
            System.out.printf("%3d", num);
        }
    }
}