package homework.practice;

import java.util.Scanner;
/*
Даны 3 переменные:

- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.

Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {
//    public static void main(String[] args) {
//
//        double operand;
//        double operand2;
//        char operation;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//        operand = sc.nextDouble();
//        System.out.println("Введите второе число:");
//        operand2 = sc.nextDouble();
//        System.out.println("Введите знак");
//        operation = sc.next().charAt(0);
//        operationSum(operand, operand2, operation);
//    }
//    public static void operationSum(double first, double second, char num) {
//        switch (num) {
//            case '+':
//                System.out.println(first + second);
//                break;
//            case '-':
//                System.out.println(first - second);
//                break;
//            case '*':
//                System.out.println(first * second);
//                break;
//            case '/':
//                System.out.println(first / second);
//                break;
//            case '%':
//                System.out.println(first % second);
//                break;
//            default:
//                System.out.println("нет такого значения");
//        }
//
//    }
//}

    public static void main(String[] args) {

        //  double operand = 5.5;
        //  double operand2 = 1.1;
        // char operation = '/';
        double result = operationSum(5.5, 1.1, '/');
        System.out.println(result);
    }

    public static double operationSum(double first, double second, char operat) {
        double result = 0;
        switch (operat) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
            case '%':
                return first % second;
            default:
                return result;

        }

    }
}
