public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (startRange % 2 == 0) {
                sumOdd += startRange;
            } else {
                sumEven += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("В отрезке [" + startRange + ", " + endRange + "] сумма четных чисел = " + "\n" +
                sumOdd + ", а нечетных = " + sumEven + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = c;
        if (b > a) {
            max = b;
        }
        if (c > b) {
            max = c;
        }
        if (b < c) {
            min = b;
        }
        if (a < b) {
            min = a;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originalNum = 1234;
        int sum = 0;
        System.out.print("Реверсивное число: ");
        while (originalNum > 0) {
            int digit = originalNum % 10;
            System.out.print(digit);
            sum += digit;
            originalNum /= 10;
        }
        System.out.println("\nСумма цифр: " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        int num = 0;
        for (int i = 1; i < 24; i += 2) {
            num++;
            System.out.printf("%5d", i);
            if (num % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = num % 5; i < 5; i++) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        originalNum = 3242592;
        int originalNumCopy = originalNum;
        int countTwos = 0;
        while (originalNum > 0) {
            if ((originalNum % 10) == 2) {
                countTwos++;
            }
            originalNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + originalNumCopy + " (четное) количество двоек - " + countTwos);
        } else {
            System.out.println("В " + originalNumCopy + " (нечетное) количество двоек - " + countTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int rows = 5;
        while (rows > 0) {
            int cols = rows;
            while (cols > 0) {
                System.out.printf("%s", '#');
                cols--;
            }
            System.out.println();
            rows--;
        }

        System.out.println();
        rows = 5;
        int cols = 1;
        int curRow = 0;
        do {
            int curCol = 0;
            do {
                System.out.print("$");
                curCol++;
            } while (curCol < cols);
            System.out.println();
            curRow++;
            if (curRow <= rows / 2) {
                cols++;
            } else {
                cols--;
            }
        } while (curRow < rows);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < 48; i += 2) {
            String result = Character.getName(i);
            System.out.printf("  %-8d    %-8c     %s\n", i, i, result);
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                String result2 = Character.getName(i);
                System.out.printf("  %-8s    %-8c     %s\n", (int) i, i, result2);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originalNum = 1234321;
        originalNumCopy = originalNum;
        int count = 0;
        while (originalNum > 0) {
            int digit2 = originalNum % 10;
            count = count * 10 + digit2;
            originalNum /= 10;
        }
        if (count == originalNumCopy) {
            System.out.println("число " + originalNumCopy + " является палиндромом");
        } else {
            System.out.println("число " + originalNumCopy + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happyNumber = 123678;
        int sumLeftPart = 0;
        int sumRightPart = 0;
        int leftPart = happyNumber / 1000;
        int leftHalf = leftPart;
        int rightPart = happyNumber % 1000;
        int righHalf = rightPart;
        while (leftPart > 0) {
            int digit3 = leftPart % 10;
            sumLeftPart += digit3;
            leftPart /= 10;
            while (rightPart > 0) {
                int digit4 = rightPart % 10;
                sumRightPart += digit4;
                rightPart /= 10;
            }
        }
        if (sumLeftPart == sumRightPart) {
            System.out.println("Число " + happyNumber + " является счастливым");
        } else {
            System.out.println("Число " + happyNumber + " не является счастливым");
        }
        System.out.println("Сумма цифр " + leftHalf + " = " + sumLeftPart + ", а сумма " + righHalf + " = " + sumRightPart);

        System.out.println("\n10. Отображение таблицы умножения Пифагора" + "\n");
        System.out.printf("    %-10s    %s\n\n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf(" |%4d%4d%4d%4d%4d%4d%4d%4d", 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("\n-----------------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("  %2d", i * j);
            }
            System.out.println();
        }
    }
}