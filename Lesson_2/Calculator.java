public class Calculator {

    private int a;
    private int b;
    private char sign;

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

    public void startCalculation() {
        int result = 1;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Мат. операция не поддерживается. Используйте: +, -, *, /, ^, %");
        }
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}