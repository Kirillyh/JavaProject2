package calculytor;
import java.util.Scanner;

public class Callc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}