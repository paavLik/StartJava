package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("М");
        wolf.setNickname("Тузик");
        wolf.setWeight(54.5F);
        wolf.setAge(4);
        wolf.setColor("Белый");

        System.out.println("Пол волка - " + wolf.getGender() + "\n" + "Кличка - " + 
                wolf.getNickname() + "\n" +
                "Вес - " + wolf.getWeight() + " кг. " + "\n" + "Возраст - " + wolf.getAge() + "\n" +
                "Цвет волка - " + wolf.getColor() + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}