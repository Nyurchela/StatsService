package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    //Среднюю сумму продаж в месяц
    public double averageSales(double[] sales) {
        double average = 0;
        for (double sale : sales) {
            average += sale / sales.length;
        }
        return average;
    }

    //Номер месяца, в котором был пик продаж
    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public double belowAverage(double[] sales) {
        double belowMonths = 0;
        for (double sale : sales) {
            if (sale < averageSales(sales)) {
                belowMonths = belowMonths + 1;
            }
        }
        return belowMonths;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public double aboveAverage(double[] sales) {
        double aboveMonth = 0;
        for (double sale : sales) {
            if (sale > averageSales(sales)) {
                aboveMonth = aboveMonth + 1;
            }
        }
        return aboveMonth;
    }
}

