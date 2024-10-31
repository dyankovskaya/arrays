package ru.dyankovskaya.arrays.service;

public class ArraysMethods {

    // 1, 2. количество четных и нечетных чисел в массиве
    public static boolean isEvenNum(int element) {
        if (element % 2 == 0) {
            return true;
        }
        return false;
    }

    //3. количество простых чисел в массиве
    public static int isSimple1(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isPrime(int element) {
        if (element < 2) {
            return false;
        }
        if (element == 2) {
            return  true;
        }
        if (element % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(element); i += 2) {
            if (element % i == 0) {
                return false;
            }
        }
        return true;
    }

    //4. сумма всех чисел в массиве


    //5. разность между суммой четных индексов и суммой нечетных индексов

    //6. количество нулей в массиве
    public static boolean isZero(int element) {
        if (element == 0) {
            return true;
        }
        return false;
    }
}