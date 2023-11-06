public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int minNumber = -10;
        int maxNumber = 21;
        int x = 0;
        int y = 0;
        System.out.print("В отрезке [" + minNumber + ", " + maxNumber + "] сумма четных чисел = ");
        do {
            if (minNumber % 2 == 0) {
                x += minNumber;
            } else {
                y += minNumber;
            }
            minNumber++;
        } while (minNumber <= maxNumber);
        System.out.println(x + ", а нечетных = " + y + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max;
        if (number1 > number2 & number1 > number3) {
            max = number1;
        } else if (number2 > number1 & number2 > number3) {
            max = number2;
        } else {
            max = number3;
        }
        int min;
        if (number1 < number2 & number1 < number3) {
            min = number1;
        } else if (number2 < number1 & number2 < number3) {
            min = number2;
        } else {
            min = number3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        System.out.print("Реверсивное число: ");
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }
        System.out.println("\nСумма цифр: " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        int num = 0;
        for (int i = 1; i < 24; i++) {
            num++;
            System.out.printf("%5d", i);
            if (num % 5 == 0) {
                System.out.println();
            }
        }
        for (int j = num % 5; j < 5; j++) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int bigNumber = 3242592;
        int twos = 0;
        while (bigNumber > 0) {
            int num2 = bigNumber % 10;
            if (num2 == 2) {
                twos++;
            }
            bigNumber /= 10;
        }
        int bigNumber2 = 3242592;
        if (twos % 2 == 0) {
            System.out.println("В " + bigNumber2 + " (четное) количество двоек - " + twos);
        } else {
            System.out.println("В " + bigNumber2 + " (нечетное) количество двоек - " + twos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 10; j++){
                System.out.printf("%s", '*');
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
        int maxRows = 5; 
        int maxColsInCurRow = 1; 
        int curRow = 0; 
        do {
            int curCol = 0;
            do {
                System.out.print("$");
                curCol++;
            } while (curCol < maxColsInCurRow);
            System.out.println();
            curRow++;
            if (curRow <= maxRows / 2) {
                maxColsInCurRow++;
            } else {
                maxColsInCurRow--;
            }
        } while (curRow < maxRows);
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < 48; i += 2) {
            String result = Character.getName(i);
            char symbol = (char) i;
            System.out.printf("  %-8d    %-8s     %s\n", i, symbol, result);
        }
        for (char symbol2 = 'a'; symbol2 <= 'z'; symbol2++) {
            if (symbol2 % 2 == 0) {
                String result2 = Character.getName(symbol2);
                System.out.printf("  %-8s    %-8s     %s", (int) symbol2, symbol2, result2);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num5 = 1234321;
        int palyndrom = num5;
        int num6 = 0;
        while (num5 != 0) {
            int digit2 = num5 % 10;
            num6 = num6 * 10 + digit2;
            num5 /= 10;
        }
        if (num6 == palyndrom) {
            System.out.println("число " + palyndrom + " является палиндромом");
        } else {
            System.out.println("число " + palyndrom + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happyNumber = 123678;
        int sum3 = 0;
        int sum4 = 0;
        int left = happyNumber / 1000;
        int leftHalf = left;
        int right = happyNumber % 1000;
        int righHalf = right;
        while (left != 0) {
            int digit3 = left % 10;
            sum3 += digit3;
            left /= 10;
            while (right != 0) {
                int digit4 = right % 10;
                sum4 += digit4;
                right /= 10;
            }
        }
        if (sum3 == sum4) {
            System.out.println("Число " + happyNumber + " является счастливым");
        } else {
            System.out.println("Число " + happyNumber + " не является счастливым");
        }
        System.out.println("Сумма цифр " + leftHalf + " = " + sum3 + ", а сумма " + righHalf + " = " + sum4);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println();
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