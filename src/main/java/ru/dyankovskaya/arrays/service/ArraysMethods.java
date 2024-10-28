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
    public static boolean isSimple(int element) {
        if (element < 2) {
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


    //5. разность между суммой четных индексов и суммой нечетных индексов

    //6. количество нулей в массиве
    public static boolean isZero(int element) {
        if (element == 0) {
            return true;
        }
        return false;
    }
}