package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = console.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);
        String option = "yes";

        do {
            if ("yes".equals(option)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            option = console.nextLine();
        } while (!"no".equals(option));
    }
}