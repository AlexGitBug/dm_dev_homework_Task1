package homework.practice;

public class Task6 {


    /**
     * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer
     * с зарплатой 600$ в месяц.
     * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
     * 300$ в месяц Ваня тратит на еду и развлечения.
     * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
     * <p>
     * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца. 37 месяцев
     * <p>
     * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
     */


    public static void main(String[] args) {
        sumNaBase(37, 1.15);

    }

    public static void sumNaBase(int cMonth, double percent) {
        int zatrati = 300;
        int upOfSalary = 400;
        int currentZP = 600;
        int itogo = 0;
        double broker = 0;
        for (int i = 0; i < cMonth; i++) {
            if (i % 6 == 0 && i != 0) {
                currentZP += upOfSalary;
            }
            itogo += currentZP - zatrati - currentZP * 0.1;
            broker += currentZP * 0.1 * percent;


        }
        System.out.println(itogo);
        System.out.println(broker);
    }
}
