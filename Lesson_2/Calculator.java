public class Calculator {

    private static int a;
    private static int b;
    private static char sign;

    public void setA(int a) {
        if (a == 0) {
            System.out.println("Введите число отличное от нуля");
        } else {
            this.a = a;
        }
    }

    public void setB(int b) {
        if (b == 0) {
            System.out.println("Введите число отличное от нуля");
        } else {
            this.b = b;
        }
    }

    public void setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
        } else {
            System.out.println("Некорректная мат.операция");
        }
    }

    public static void calculate() {
        int result = 1;
        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            case '^' -> {
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            }
            default -> throw new IllegalArgumentException("Мат. операция может принимать только следующие значения: " +
                    "'+', '-', '*', '/', '%', '^'");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}