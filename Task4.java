package homework.practice;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task4 {

    public static void main(String[] args) {
        int value = 228910;
        int chetnie = chetnieValue(value);
        System.out.println(chetnie);
        int neChetnie = neChetnieValue(value);
        System.out.println(neChetnie);

    }
    private static int neChetnieValue(int value) {
        int result;
        int count = 0;
        for (int i = value; i != 0; i /= 10) {
            result = i % 10;
            if (result % 2 == 1) {
                ++count;
                System.out.print(result + " ");
            }

        }
        System.out.print(". общее число нечетных чисел = ");
        return count;
    }
    private static int chetnieValue(int value) {
        int result;
        int count = 0;
        for (int i = value; i != 0; i /= 10) {
            result = i % 10;
            if (result % 2 == 0) {
                ++count;
                System.out.print(result+ " ");
            }

        }
        System.out.print(". общее число нечетных чисел = ");
        return count;
    }
}
