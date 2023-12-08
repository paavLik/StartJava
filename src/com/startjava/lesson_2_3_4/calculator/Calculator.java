package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        checkExpression(partsExpression);
        int a = Integer.parseInt(partsExpression[0]);
        int b = Integer.parseInt(partsExpression[2]);
        String sign = partsExpression[1];
        return switch (sign) {
            case "+" -> Math.addExact(a, b);
            case "-" -> Math.subtractExact(a, b);
            case "*" -> Math.multiplyExact(a, b);
            case "/" -> Math.floorDiv(a, b);
            case "%" -> Math.floorMod(a, b);
            case "^" -> (int) Math.pow(a, b);
            default -> throw new IllegalStateException("Ошибка: знак " + partsExpression[1] + " не поддерживается");
        };
    }

    public static void checkExpression(String[] expression) {
        if (expression.length != 3) {
            throw new IllegalArgumentException("Ошибка! Неверное кол-во пробелов между символами! Пример ввода: 2 + 2");
        }
        try {

            if (Integer.parseInt(expression[0]) < 1 || Integer.parseInt(expression[2]) < 1) {
                throw new IllegalArgumentException("Ошибка! Необходимо ввести положительное число!");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка! Необходимо ввести целые числа!");
        }
    }
}