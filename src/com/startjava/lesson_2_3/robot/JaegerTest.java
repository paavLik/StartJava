package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setStrength(10);

        System.out.println("Имя Егеря - " + jaeger1.getModelName() + ", Поколение - " + jaeger1.getMark() +
                ", Сила - " + jaeger1.getStrength());
        System.out.print("Поиск Кадзю - ");
        jaeger1.scanKaiju();
        jaeger1.generateEnergy();
        jaeger1.attack();
        jaeger1.checkStatusKaiju();
        jaeger1.react();

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", 8);

        System.out.println("\nИмя Егеря - " + jaeger2.getModelName() + ", Поколение - " + jaeger2.getMark() +
                ", Сила - " + jaeger2.getStrength());
        System.out.print("Поиск Кадзю - ");
        jaeger2.scanKaiju();
        jaeger2.generateEnergy();
        jaeger2.attack();
        jaeger2.checkStatusKaiju();
        jaeger2.react();
    }
}