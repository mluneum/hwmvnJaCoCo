package ru.netology.javamvn.statistics.JaCoCo.statistics;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_singleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5};
        long expected = 5;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_allSame() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {3, 3, 3};
        long expected = 3;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_negativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-5, -1, -10};
        long expected = -1;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}