package com.startjava.lesson_1.final;

public class MyFirstGame {
    public static void main(String[] args) {
        int playerNum = 12;
        int minRange = 1;
        int maxRange = 100;
        int hiddenNum = 33;
        while (playerNum != hiddenNum) {
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                maxRange = playerNum;
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                minRange = playerNum;
            }
            playerNum = (maxRange + minRange) / 2;
        }
        System.out.println("Вы победили!");
    }
}