package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        checkExpression(partsExpression);
        double result = 1;
        int a = Integer.parseInt(partsExpression[0]);
        int b = Integer.parseInt(partsExpression[2]);
        String sign = partsExpression[1];
        switch (partsExpression[1]) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = (double) a / (double) b;
            case "%" -> result = a % b;
            case "^" -> result = (int) Math.pow(a, b);
            default -> System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }
        return result;
    }

    public static void checkExpression(String[] expression) {
        if (expression.length != 3) {
            throw new IllegalArgumentException("Ошибка! Неверное кол-во пробелов между символами!");
        }
        if (Integer.parseInt(expression[0]) < 0 || Integer.parseInt(expression[2]) < 0) {
            throw new IllegalArgumentException("Ошибка! Вы ввели отрицательное число!");
        }
    }
}