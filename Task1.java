package homework.practice;

/*
Задание 1

В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.
 */
public class Task1 {
    public static void main(String[] args) {
        int minutes = 55;
        quarterOfAnHour(minutes);
    }

    public static void quarterOfAnHour(int value) {
        if (value >= 1 && value <= 14) {
            System.out.println("Первая четверть часа");
        } else if (value >= 15 && value <= 29) {
            System.out.println("Вторая четверть часа");
        } else if (value >= 30 && value <= 44) {
            System.out.println("Третья четверть часа");
        } else if (value >= 45 && value <= 59) {
            System.out.println("третья четверть часа");
        } else {
            System.out.println("Неверное число");
        }

    }
}
