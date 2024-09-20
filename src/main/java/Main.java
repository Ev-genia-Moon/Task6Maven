import ru.netology.Task6Maven.services.calculate;

public class Main {
    public static void main(String[] args) {
        calculate service = new calculate();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;

        int countMonth = service.calculateMonth(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + expected + " == ? == " + countMonth);
        System.out.println("Отдохнуть получится " + countMonth + " месяца/-ев за год");

    }
}
