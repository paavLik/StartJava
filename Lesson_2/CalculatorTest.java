import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.println("Введите первое число: ");
                calculator.setA(scanner.nextInt());
                System.out.println("Введите знак математической операции: ");
                calculator.setSign(scanner.next().charAt(0));
                System.out.println("Введите второе число: ");
                calculator.setB(scanner.nextInt());
                Calculator.calculate();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}