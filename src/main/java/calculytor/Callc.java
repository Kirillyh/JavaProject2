package calculytor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Callc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = getNumberInput(scanner);

        System.out.println("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double num2 = getNumberInput(scanner);

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

    // Метод для получения ввода числа, с учетом ограничений на ввод
    private static double getNumberInput(Scanner scanner) {
        double num;
        while (true) {
            String input = scanner.next();
            try {
                // Пытаемся распознать введенное значение как число
                num = Double.parseDouble(input);
                // Проверяем ограничение на ввод чисел больше 10
                if (num > 10) {
                    System.out.println("Ошибка: Число не должно быть больше 10.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                // Введенное значение не является числом, пытаемся распознать как римское число
                try {
                    num = RomanConverter.romanToArabic(input);
                    break;
                } catch (IllegalArgumentException ex) {
                    System.out.println("Ошибка: Введите корректное число.");
                }
            }
        }
        return num;
    }
}

// Класс для конвертации римских чисел в арабские
class RomanConverter {
    private static final Map<Character, Integer> romanNumerals = new HashMap<>();

    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }

    // Метод для конвертации римского числа в арабское
    public static int romanToArabic(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentNumeral = romanNumerals.get(roman.charAt(i));

            if (i + 1 < roman.length()) {
                int nextNumeral = romanNumerals.get(roman.charAt(i + 1));

                if (currentNumeral < nextNumeral) {
                    result -= currentNumeral;
                } else {
                    result += currentNumeral;
                }
            } else {
                result += currentNumeral;
            }
        }

        return result;
    }
}