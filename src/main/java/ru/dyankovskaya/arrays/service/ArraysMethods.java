package ru.dyankovskaya.arrays.service;

public class ArraysMethods {

    // 1. количество четных чисел в массиве
    public static int evenCounter(int[] array) {
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven++;
            }
        }
        return counterEven;
    }

    //2. количество нечетных чисел в массиве
    public static int oddCounter(int[] array) {
        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counterOdd++;
            }
        }
        return counterOdd;
    }

    //3. количество простых чисел в массиве
    public static int primeCounter(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    // определитель простого числа для 3 задания
    public static boolean isPrime(int element) {
        if (element <= 1) {
            return false;
        }
        for (int div = 2; div <= Math.sqrt(element); div++) {
            if (element % div == 0) {
                return false;
            }
        }
        return true;
    }

    //4. сумма всех чисел в массиве
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //5. разность между суммой четных индексов и суммой нечетных индексов
    public static int diff(int[] array) {
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        int diff = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum = evenIndexSum + array[i];
            } else {
                oddIndexSum = oddIndexSum + array[i];
            }
        }
        diff = evenIndexSum - oddIndexSum;
        return diff;
    }

    //6. количество нулей в массиве
    public static int zeroCounter(int[] array) {
        int zeroCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCounter++;
            }
        }
        return zeroCounter;
    }
}