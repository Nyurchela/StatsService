package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test //Сумма всех продаж
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumAllSales(sales);
        int expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Среднюю сумму продаж в месяц
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца, в котором был пик продаж
    public void shouldMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(sales);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Номер месяца, в котором был минимум продаж
    public void shouldMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(sales);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Кол-во месяцев, в которых продажи были ниже среднего
    public void shouldMonthSalesBelowAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.belowAverage(sales);
        double expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test //Кол-во месяцев, в которых продажи были выше среднего
    public void shouldMonthSalesAboveAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.aboveAverage(sales);
        double expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}
