public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        // количество ядер процессора
        int numberProcessoCores = 8;

        // размер оперативной памяти
        short ramCapacity = 6144;

        // размер жесткого диска в Гб
        byte hddCapacity = 3;

        // частота процессора
        long cpuFrequency = 2000;

        // версия BIOS
        float biosVersion = 2.7f;

        // размер файла подкачки
        double pagingFileSize = 8.00;

        // у ПК есть ядра?
        boolean isPcHasCores = true;

        // Кнопка подтверждения на клавиатуре "Yes"
        char keyKeyboardY  = 'Y';

        System.out.println(numberProcessoCores + " - количество ядер процессора" + "\n" +
                ramCapacity + " - размер оперативной памяти в МБайт" + "\n" +
                hddCapacity + " - размер жесткого диска в Гб" + "\n" +
                cpuFrequency + " - частота процессора в Ггц" + "\n" +
                biosVersion + " - версия BIOS" + "\n" +
                pagingFileSize + " - размер файла подкачки в Гб" + "\n" +
                isPcHasCores + " - у ПК есть ядра?" + "\n" +
                keyKeyboardY + " - Кнопка подтверждения на клавиатуре Yes" + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
                // цена ручки
                double pinPrice = 100;

                // цена книги
                double bookPrice = 200;

                // скидка в процентах
                double discountPercent = 11;

                // общая стоимость товаров без скидки
                double priceNoDiscount = pinPrice + bookPrice;

                // сумма скидки
                double discountAmount = priceNoDiscount * discountPercent / 100;

                // стоимость товаров со скидкой
                double newPriceProducts = priceNoDiscount - discountAmount;

        System.out.println("общая стоимость товаров без скидки = " + priceNoDiscount + "\n" +
                "сумма скидки = " + discountAmount + "\n" +
                "общая стоимость товаров со скидкой = " + newPriceProducts + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n" + 
                "   J   a a  v   v  a a" + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a" + "\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
                // byte original value
                byte byteOriginalValue = 127;

                // byte increment
                byte byteIncrement = byteOriginalValue++;

                // byte decrement
                byte byteDecrement = byteOriginalValue--;

                // short original value
                short shortOriginalValue = 32767;

                // short increment
                short shortIncrement = shortOriginalValue++;

                // short decrement
                short shortDecrement = shortOriginalValue--;

                // int original value
                int intOriginalValue = 2147483647;

                // int increment
                int intIncrement = intOriginalValue++;

                // int decrement
                int intDecrement = intOriginalValue--;

                // long original value
                long longOriginalValue = 9223372036854775807l;

                // long increment
                long longIncrement = longOriginalValue++;

                // long decrement
                long longDecrement = longOriginalValue--;

        System.out.println("первоначальное значение byte = " + byteOriginalValue + "\n" +
                "значение byte после инкремента на единицу = " + byteIncrement + "\n" +
                "значение byte после декремента на единицу = " + byteDecrement + "\n" +
                "первоначальное значение short = " + shortOriginalValue + "\n" +
                "значение после short инкремента на единицу = " + shortIncrement + "\n" +
                "значение после short декремента на единицу = " + shortDecrement + "\n" +
                "первоначальное значение int = " + intOriginalValue + "\n" +
                "значение после int инкремента на единицу = " + intIncrement + "\n" +
                "значение после int декремента на единицу = " + intDecrement + "\n" +
                "первоначальное значение long = " + longOriginalValue + "\n" +
                "значение после long инкремента на единицу = " + longIncrement + "\n" +
                "значение после long декремента на единицу = " + longDecrement + "\n");

        System.out.println("5. Перестановка значений переменных");
                int one = 2;
                int two = 5;
        System.out.println("с помощью третьей переменной " + "\n" +
                "исходные значения переменных : one = " + one + " two = " + two);
                int three = one;
                one = two;
                two = three;
        System.out.println("новые значения переменных : one = " + one + " two = " + two + "\n" +
                "с помощью арифметических операций " + "\n" +
                "исходные значения переменных : one = " + one + " two = " + two);
                one = one + two;
                two = one - two;
                one = one - two;
        System.out.println("новые значения переменных : one = " + one + " two = " + two + "\n" +
                "с помощью побитовой операции ^ " + "\n" +
                "исходные значения переменных : one = " + one + " two = " + two);
                // 010 ^ 101 = 111 
                one = one ^ two;

                // 101 ^ 111 = 010
                two = two ^ one;

                // 111 ^ 010 = 101
                one = one ^ two;
        System.out.println("новые значения переменных : one = " + one + " two = " + two + "\n");

        System.out.println("6. Вывод символов и их кодов");
                char dollar = '$';
                int asciiDollar = (int) dollar;

                char asterisk = '*';
                int asciiAsterisk = (int) asterisk;

                char atSign = '@';
                int asciiAtSign = (int) atSign;

                char verticalBar = '|';
                int asciiVerticalBar = (int) verticalBar;

                char tilde = '~';
                int asciiTilde = (int) tilde;
        System.out.println(dollar + " " + asciiDollar + "\n" +
                asterisk + " " + asciiAsterisk + "\n" +
                atSign + " " + asciiAtSign + "\n" +
                verticalBar + " " + asciiVerticalBar + "\n" +
                tilde + " " + asciiTilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
                char slash = '/';
                char underscore = '_';
                char backslash = '\\';
                char leftParenthesis = '(';
                char rightParenthesis = ')';
        System.out.println("    " + slash + backslash + "\n" +
                "   " + slash + "  " + backslash + "\n" + 
                "  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash + "\n" +
                " " + slash + "      " + backslash + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
                // дано число 123
                int number = 123;

                // находим сотни у числа
                int numberHundreds = number / 100;

                // находим десятки, сокращая число в 10 раз, т.е. отбрасываем у числа крайнюю цифру
                // затем вычисляем остаток от деления у полученного резльтата 
                int numberTens = number / 10 % 10;

                // вычисляем последнию цифру у данного числа, т.е. единицы числа
                int numberUnits = number % 10;

                // находим сумму найденных цифр
                int sum = numberHundreds + numberTens + numberUnits;

                // находим произведение найденных цифр
                int multiplying = numberHundreds * numberTens * numberUnits;
        System.out.println("Число " + number + " содержит: " + "\n" +
                "  сотен - " + numberHundreds + "\n" +
                "  десятков - " + numberTens + "\n" +
                "  единиц - " + numberUnits + "\n" +
                "Сумма его цифр = " + sum + "\n" +
                "Произведение = " + multiplying + "\n");

        System.out.println("9. Вывод времени");
                // общее кол-во секунд
                int allSecs = 86399;

                // находим обще число минут
                int allMin = allSecs / 60;

                // находим кол-во секунд
                int sec = allSecs - (allMin * 60);

                // находим кол-во часов
                int hors = allMin / 60;

                // находим кол-во минут
                int min = allMin - ((hors * 3600) / 60);
        System.out.println(hors + ":" + min + ":" + sec + "\n");
    }
}