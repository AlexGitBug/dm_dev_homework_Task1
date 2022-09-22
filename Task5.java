package homework.practice;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task5 {
    public static void main(String[] args) {

        int value = 123456;
        int result = backValueWhile(value);
        System.out.println(result);
        int result1 = backValueFor(value);
        System.out.println(result1);

    }

    public static int backValueWhile(int value) {
        int result = 0;
        while (value != 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    public static int backValueFor(int value) {
        int result = 0;
        for (; value != 0; value /= 10) {
            result = result * 10 + value % 10;
        }
        return result;
    }
}

