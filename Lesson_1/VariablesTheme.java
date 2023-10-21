public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int numberProcessoCores = 8;
        short ramCapacity = 6144;
        byte hddCapacity = 3;
        long cpuFrequency = 2000;
        float biosVersion = 2.7f;
        double pagingFileSize = 8.00;
        boolean isPcHasCores = true;
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
        double pinPrice = 100;
        double bookPrice = 200;
        double discountPercent = 11;
        double priceNoDiscount = pinPrice + bookPrice;
        double discountAmount = priceNoDiscount * discountPercent / 100;
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
        byte byteOriginalValue = 127;
        byte byteIncrement = byteOriginalValue++;
        byte byteDecrement = byteOriginalValue--;
        short shortOriginalValue = 32767;
        short shortIncrement = shortOriginalValue++;
        short shortDecrement = shortOriginalValue--;
        int intOriginalValue = 2147483647;
        int intIncrement = intOriginalValue++;
        int intDecrement = intOriginalValue--;
        long longOriginalValue = 9223372036854775807l;
        long longIncrement = longOriginalValue++;
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
        one = one ^ two;
        two = two ^ one;
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
        int number = 123;
        int numberHundreds = number / 100;
        int numberTens = number / 10 % 10;
        int numberUnits = number % 10;
        int sum = numberHundreds + numberTens + numberUnits;
        int multiplying = numberHundreds * numberTens * numberUnits;
        System.out.println("Число " + number + " содержит: " + "\n" +
        "  сотен - " + numberHundreds + "\n" +
        "  десятков - " + numberTens + "\n" +
        "  единиц - " + numberUnits + "\n" +
        "Сумма его цифр = " + sum + "\n" +
        "Произведение = " + multiplying + "\n");

        System.out.println("9. Вывод времени");
        int allSecs = 86399;
        int allMin = allSecs / 60;
        int sec = allSecs - (allMin * 60);
        int hors = allMin / 60;
        int min = allMin - ((hors * 3600) / 60);
        System.out.println(hors + ":" + min + ":" + sec + "\n");
    }
}