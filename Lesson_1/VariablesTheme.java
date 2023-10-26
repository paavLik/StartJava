public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int numberCpuCores = 8;
        short ramCapacity = 6144;
        byte hddCapacity = 3;
        long cpuFrequency = 2000;
        float biosVersion = 2.7f;
        double pagingFileSize = 8.00;
        boolean hasPcCores = true;
        char keyKeyboardY  = 'Y';

        System.out.println(numberCpuCores + " - количество ядер процессора" + "\n" +
                ramCapacity + " - размер оперативной памяти в МБайт" + "\n" +
                hddCapacity + " - размер жесткого диска в Гб" + "\n" +
                cpuFrequency + " - частота процессора в Ггц" + "\n" +
                biosVersion + " - версия BIOS" + "\n" +
                pagingFileSize + " - размер файла подкачки в Гб" + "\n" +
                hasPcCores + " - у ПК есть ядра?" + "\n" +
                keyKeyboardY + " - Кнопка подтверждения на клавиатуре Yes" + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double penPrice = 100;
        double bookPrice = 200;
        double discountPercent = 11;
        double fullSum = penPrice + bookPrice;
        double discountAmount = fullSum * discountPercent / 100;
        double discountPrice = fullSum - discountAmount;

        System.out.println("общая стоимость товаров без скидки = " + fullSum + "\n" +
                "сумма скидки = " + discountAmount + "\n" +
                "общая стоимость товаров со скидкой = " + discountPrice + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n" + 
                "   J   a a  v   v  a a" + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a" + "\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;
        System.out.println("первоначальное значение byte = " + maxByte + "\n" +
                "значение byte после инкремента на единицу = " + ++maxByte + "\n" +
                "значение byte после декремента на единицу = " + --maxByte + "\n" +
                "первоначальное значение short = " + maxShort + "\n" +
                "значение после short инкремента на единицу = " + ++maxShort + "\n" +
                "значение после short декремента на единицу = " + --maxShort + "\n" +
                "первоначальное значение int = " + maxInt + "\n" +
                "значение после int инкремента на единицу = " + ++maxInt + "\n" +
                "значение после int декремента на единицу = " + --maxInt + "\n" +
                "первоначальное значение long = " + maxLong + "\n" +
                "значение после long инкремента на единицу = " + ++maxLong + "\n" +
                "значение после long декремента на единицу = " + --maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("с помощью третьей переменной " + "\n" +
                "исходные значения переменных : a = " + a + " b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("новые значения переменных : a = " + a + " b = " + b + "\n" +
                "с помощью арифметических операций " + "\n" +
                "исходные значения переменных : a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("новые значения переменных : a = " + a + " b = " + b + "\n" +
                "с помощью побитовой операции ^ " + "\n" +
                "исходные значения переменных : a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("новые значения переменных : a = " + a + " b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println(dollar + " " + (int) dollar + "\n" +
                asterisk + " " + (int) asterisk + "\n" +
                atSign + " " + (int) atSign + "\n" +
                verticalBar + " " + (int) verticalBar + "\n" +
                tilde + " " + (int) tilde + "\n");

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
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;
        System.out.println("Число " + number + " содержит: " + "\n" +
                "  сотен - " + hundreds + "\n" +
                "  десятков - " + tens + "\n" +
                "  единиц - " + units + "\n" +
                "Сумма его цифр = " + sum + "\n" +
                "Произведение = " + product + "\n");

        System.out.println("9. Вывод времени");
        int totalSec = 86399;
        int hh = totalSec / 3600;
        int mm = totalSec / 60 % 60;
        int ss = totalSec % 60;

        System.out.println(hh + ":" + mm + ":" + ss + "\n");
    }
}