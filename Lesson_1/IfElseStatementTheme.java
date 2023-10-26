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
        if ( height < 1.8 ) {
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
        } else if(a == b) {
            System.out.println("Числа " + a + " и " + b + " равны");
        } else {
            System.out.println("Что-то пошло не так");
        }

        System.out.println("3. Проверка числа");
        int number = -23;
        if (number == 0 ) {
            System.out.println("Число " + number + " равно нулю");
        } else if (number % 2 == 0 & number > 0) {
            System.out.println("Число " + number + " является положительным и четным");
        } else if (number % 2 == 0 & number < 0) {
            System.out.println("Число " + number + " является отрицательным и четным");
        } else if (number % 2 != 0 & number > 0) {
            System.out.println("Число " + number + " является положительным и нечетным");
        } else if (number % 2 != 0 & number < 0) {
            System.out.println("Число " + number + " является отрицательным и нечетным");
        } else {
            System.out.println("Что-то пошло не так");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int numberOne = 223;
        int numberTwo = 123;
        int hundredsOne = numberOne / 100;
        int tensOne = numberOne / 10 % 10;
        int unitsOne = numberOne % 10;
        int hundredsTwo = numberTwo / 100;
        int tensTwo = numberTwo / 10 % 10;
        int unitsTwo = numberTwo % 10;
        if (numberOne == numberTwo) {
            System.out.println("Исходные числа = " + numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + numberOne + "\n" +
                    "номера разрядов = 1,2 и 3");
        } else if (hundredsOne == hundredsTwo & tensOne == tensTwo) {
            System.out.println("Исходные числа = " +numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + hundredsTwo + tensTwo + "\n" + 
                    "номера разрядов = 3 и 2 ");
        } else if (hundredsOne == hundredsTwo & unitsOne == unitsTwo) {
            System.out.println("Исходные числа = " + numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + hundredsTwo + unitsOne + "\n" + 
                    "номера разрядов = 3 и 1 ");
        } else if (tensOne == tensTwo & unitsOne == unitsTwo) {
            System.out.println("Исходные числа = " +numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + tensTwo + unitsOne + "\n" + 
                    "номера разрядов = 2 и 1 ");    
        } else if (hundredsOne == hundredsTwo) {
            System.out.println("Исходные числа = " + numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + hundredsTwo + "\n" +
                    "номера разрядов = 3");
        } else if (tensOne == tensTwo) {
            System.out.println("Исходные числа = " + numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + tensTwo + "\n" +
                    "номера разрядов = 2");
        } else if (unitsOne == unitsTwo) {
            System.out.println("Исходные числа = " + numberOne + " и " + numberTwo + "\n" +
                    "одинаковые в них цифры = " + unitsTwo + "\n" +
                    "номера разрядов = 1");
        }

        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 48 & symbol <= 57) {
            System.out.println("Символ " + symbol + " является цифрой"); 
        } else if (symbol >= 65 & symbol <= 90) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= 97 & symbol <= 122) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("Символ " + symbol + " не является буквой или цифрой");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        double sum  = 301000;
        if (sum < 100000) { 
            System.out.println("Сумма вклада = " + sum + "\n" +
                    "сумма начисленного % = " + sum * 0.05 + "\n" +
                    "итоговаю сумма с % = " + (sum + (sum * 0.05)) + "\n");
        } else if (sum >=100000 & sum <= 300000){
            System.out.println("Сумма вклада = " + sum + "\n" +
                    "сумма начисленного % = " + sum * 0.07 + "\n" +
                    "итоговаю сумма с % = " + (sum + (sum * 0.07)) + "\n");
        } else if (sum > 300000){
            System.out.println("cумма вклада = " + sum + "\n" +
                    "сумма начисленного % = " + sum * 0.10 + "\n" +
                    "итоговаю сумма с % = " + (sum + (sum * 0.10)) + "\n");
        }

        System.out.println("7. Определение оценки по предметам");
        int historyTotalPercent = 59;
        int historyGrade;
        int programmingTotalPercent = 92;
        int programmingGrade;
        if (historyTotalPercent <= 60) {
        historyGrade = 2;
        } else if (historyTotalPercent > 60 && historyTotalPercent <= 73) {
            historyGrade = 3;
        } else if (historyTotalPercent > 73 && historyTotalPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (programmingTotalPercent <= 60) {
        programmingGrade = 2;
        } else if (programmingTotalPercent > 60 && programmingTotalPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingTotalPercent > 73 && programmingTotalPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        System.out.println("история - " + historyGrade + "\n" +
                "программирование - " + programmingGrade + "\n" +
                "gpa (средний балл оценок) = " + ((historyGrade + programmingGrade)/2) + "\n" +
                "средний % по предметам = " + ((historyTotalPercent + programmingTotalPercent)/2) + "\n");

        System.out.println("8. Расчет годовой прибыли");
        int profitMonth = 13000;
        int rentMonth = 5000;
        int costPriceMonth = 9000;
        int profitYear = (profitMonth * 12) - ((rentMonth * 12) + (costPriceMonth * 12));
        if (profitYear > 0 & profitYear != 0) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }
    }
}



