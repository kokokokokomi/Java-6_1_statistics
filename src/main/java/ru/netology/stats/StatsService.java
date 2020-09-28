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
        long sum = calculateSum(purchases);

        // считаем средние продажи: сумму продаж (sum) делим на количество элементов (length) в массиве;
        long averageSales = sum / purchases.length;
        return averageSales;
    }

    public long findMaxIndex(long[] purchases) {
        int index = 0;
        for (int i = 0; i < purchases.length; i++) {
            index = purchases[i] > purchases[index] ? i : index;
        }

        return index;
    }

    public long findMinIndex(long[] purchases) {
        int index = 0;
        for (int i = 0; i < purchases.length; i++) {
            index = purchases[i] < purchases[index] ? i : index;
        }

        return index;
    }

    public long findQuantityBelowAverage(long[] purchases) {

        long averageSales = calculateAverageSales(purchases);
        int quantity = 0;
        for (long purchase : purchases) {
            if (purchase < averageSales) {
                quantity++;
            }
        }
        return quantity;
    }

    public long findQuantityOverAverage(long[] purchases) {

        long averageSales = calculateAverageSales(purchases);
        int quantity = 0;
        for (long purchase : purchases) {
            if (purchase > averageSales) {
                quantity++;
            }
        }
        return quantity;
    }
}