package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "") {
            System.out.println("Пустая строка!");
        } else {
            this.gender = gender;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname.length() < 6) {
            System.out.println("Слишком короткая кличка!");
        } else {
            this.nickname = nickname;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight < 50) {
            System.out.println("Недопустимый вес!");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "Белый") {
            System.out.println("Некорректный цвет");
        } else {
            this.color = color;
        }
    }

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}