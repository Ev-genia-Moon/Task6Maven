package ru.netology.Task6Maven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.Task6Maven.services.calculate;

public class calculateTest {

    @Test
    void shouldCalculateForincome10000() {
        calculate service = new calculate();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;

        // вызываем целевой метод:
        int countMonth = service.calculateMonth(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, countMonth);
    }

    @Test
    void shouldCalculateForincome100000() {
        calculate service = new calculate();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;

        // вызываем целевой метод:
        int countMonth = service.calculateMonth(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, countMonth);
    }
}
