package homework.practice;
/*Задание 3

        Даны два прямоугольных треугольника.
        Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
        Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

        Для этого понадобится написать 2 функции.
        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
        Учитывать, что площадь может быть вещественным числом.
        */

public class Task3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int a1 = 7;
        int b1 = 5;
        double result = square(a, b);
        System.out.println(result);
        double result1 = square(a1, b1);
        System.out.println(result1);
        compare(result, result1);
    }
    public static double square(double value, double value1) {
        double squareFinal = 1;
        if (value > 0 && value1 > 0) {
            return (value + value1) * 0.5;
        } else {
            return squareFinal;
        }

    }
    public static void compare(double sq1, double sq2) {
        if (sq1 > sq2) {
            System.out.println("S первого треугольника больше второго");
        } else if (sq1 < sq2) {
            System.out.println("S первого треугольника меньше второго");
        } else {
            System.out.println("S первого треугольника равен площади второго");
        }
    }
}