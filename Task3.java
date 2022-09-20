package homework.practice;

public class Task3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 10;
        int d = 2;
        double result = square(a, b);
        System.out.println(result);
        double result2 = square(c, d);
        System.out.println(result2);
        compare(result, result2);
    }

    public static double square(double value, double value1) {
        double operation = 0;
        if (value > 0 && value1 > 0) {
            return (value + value1) * 0.5;
        } else {
            return operation;
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
