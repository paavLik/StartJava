public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Перед нами мужик!");
        } else {
            System.out.println("Дождались! Это девушка!");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Уже можно.");
        } else {
            System.out.println("Еще рано!");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Ваше расстояние от верхушечной точки головы до плоскости < 1.8 см.");
        } else {
            System.out.println("Ваше расстояние от верхушечной точки головы до плоскости - выше среднего");
        }

        char firstLetterName = "Michael".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Вы нам подходите.");
        } else if (firstLetterName == 'I') {
            System.out.println("Мы вам перезвоним...");
        } else {
            System.out.println("Давай до свидания!");
        }

        System.out.println("2. Поиск большего числа");
        int a = 77;
        int b = 99;
        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (a < b) {
            System.out.println("Число " + a + " меньше числа " + b);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }

        System.out.println("3. Проверка числа");
        int number = -17;
        if (number == 0) {
            System.out.println("Число " + number + " является нулем");
        }
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.print("Число " + number + " является четным");
            } else {
                System.out.print("Число " + number + " является нечетным");
            }
            if (number > 0) {
                System.out.println(" и положительным");
            } else {
                System.out.println(" и отрицательным");
            }

            System.out.println("4. Поиск одинаковых цифр в числах");
            int number1 = 123;
            int number2 = 124;
            System.out.println("Исходные числа = " + number1 + " и " + number2);
            if (number1 == number2) {
                System.out.println("цифры в каждом разряде 1, 2, 3 - равны! " + number1);
            }
            int hundreds1 = number1 / 100;
            int hundreds2 = number2 / 100;
            if (hundreds1 == hundreds2) {
                System.out.println("найдено совпадение в 3 разряде: цифра " + hundreds2);
            }
            int tens1 = number1 / 10 % 10;
            int tens2 = number2 / 10 % 10;
            if (tens1 == tens2) {
                System.out.println("найдено совпадение в 2 разряде: цифра " + tens2);
            }
            int ones1 = number1 % 10;
            int ones2 = number2 % 10;
            if (ones1 == ones2) {
                System.out.println("найдено совпадение в 1 разряде: цифра " + ones2);
            }
            if (hundreds1 != hundreds2 & tens1 != tens2 & ones1 != ones2) {
                System.out.println("Совпадения не найдены!");
            }

            System.out.println("5. Определение символа по его коду");
            char symbol = '\u0057';
            if (symbol >= '0' & symbol <= '9') {
                System.out.println("Символ " + symbol + " является цифрой");
            } else if (symbol >= 'A' & symbol <= 'Z') {
                System.out.println("Символ " + symbol + " является большой буквой");
            } else if (symbol >= 'a' & symbol <= 'z') {
                System.out.println("Символ " + symbol + " является маленькой буквой");
            } else {
                System.out.println("Символ " + symbol + " не является буквой или цифрой");
            }

            System.out.println("6. Подсчет суммы вклада и начисленных банком %");
            double sum = 301000;
            double amountPercent = sum * 0.10;
            if (sum < 100000) {
                amountPercent = sum * 0.05;
            } else if (sum >= 100000 & sum <= 300000) {
                amountPercent = sum * 0.07;
            }
            System.out.println("cумма вклада = " + sum + "\n" +
                    "сумма начисленного % = " + amountPercent + "\n" +
                    "итоговаю сумма с % = " + (amountPercent + sum) + "\n");

            System.out.println("7. Определение оценки по предметам");
            int historyPercent = 59;
            int historyGrade = 2;
            if (historyPercent > 60 && historyPercent <= 73) {
                historyGrade = 3;
            } else if (historyPercent > 73 && historyPercent <= 91) {
                historyGrade = 4;
            } else if (historyPercent > 91) {
                historyGrade = 5;
            }
            int programmingPercent = 92;
            int programmingGrade = 5;
            if (programmingPercent <= 60) {
                programmingGrade = 2;
            } else if (programmingPercent > 60 && programmingPercent <= 73) {
                programmingGrade = 3;
            } else if (programmingPercent > 73 && programmingPercent <= 91) {
                programmingGrade = 4;
            }
            System.out.println("история - " + historyGrade + "\n" +
                    "программирование - " + programmingGrade + "\n" +
                    "gpa (средний балл оценок) = " + ((historyGrade + programmingGrade) / 2) + "\n" +
                    "средний % по предметам = " + ((historyPercent + programmingPercent) / 2) + "\n");

            System.out.println("8. Расчет годовой прибыли");
            int profitMonth = 13000;
            int rentMonth = 5000;
            int costPriceMonth = 9000;
            int profitYear = (profitMonth - costPriceMonth - rentMonth) * 12;
            if (profitYear > 0) {
                System.out.println("Прибыль за год: +" + profitYear + " руб.");
            } else {
                System.out.println("Прибыль за год: " + profitYear + " руб.");
            }
        }
    }
}