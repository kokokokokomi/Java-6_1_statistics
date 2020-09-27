package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        // считаем средние продажи: сумму продаж (sum) делим на количество элементов (length) в массиве;
        long AverageSales = sum / purchases.length;
        return AverageSales;
    }

    public long findMaxMonthNumber(long[] purchases) {
        int number = 0;
        // i++ аналог i = i+1;
        for (int i = 0; i <= 12; i++) {
        }
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        long MaxMonthNumber = purchases[number];
        return MaxMonthNumber;
    }

    public long findMinMonthNumber(long[] purchases) {
        int number = 0;
        // i++ аналог i = i+1;
        for (int i = 0; i <= 12; i++) {
        }
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (purchase < currentMin) {
                currentMin = purchase;
            }
        }
        long MinMonthNumber = purchases[number];
        return MinMonthNumber;
    }

    public long findMonthQuantityUnderAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        // считаем средние продажи: сумму продаж (sum) делим на количество элементов (length) в массиве;
        long AverageSales = sum / purchases.length;
        int i = 1;
        int quantity = 0;
        for (long purchase : purchases) {
            if (purchase < AverageSales) {
                quantity = i++;
            }
        }

        long MonthQuantityUnderAverage = quantity;
        return MonthQuantityUnderAverage;
    }

    public long findMonthQuantityOverAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        // считаем средние продажи: сумму продаж (sum) делим на количество элементов (length) в массиве;
        long AverageSales = sum / purchases.length;
        int i = 1;
        int quantity = 0;
        for (long purchase : purchases) {
            if (purchase > AverageSales) {
                quantity = i++;
            }
        }

        long MonthQuantityOverAverage = quantity;
        return MonthQuantityOverAverage;
    }
}