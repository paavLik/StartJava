package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static GuessNumber game;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initGame();
        play();
    }

    private static void play() {
        do {
            game.start();
        } while (isNext());
    }

    private static void initGame() {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        game = new GuessNumber(player1, player2, scanner);
    }

    private static Player createPlayer(int serialNumber) {
        System.out.print("Игрок " + serialNumber + " представься ");
        return new Player(scanner.next());
    }

    private static boolean isNext() {
        String answer;
        do {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
            if (answer.equals("yes")) {
                return true;
            }
        } while (!answer.equals("no"));
        return false;
    }
}

