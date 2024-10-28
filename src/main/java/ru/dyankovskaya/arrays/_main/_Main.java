package ru.dyankovskaya.arrays._main;

import ru.dyankovskaya.arrays.service.ArraysMethods;

import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int sum = 0;
        int zero = 0;
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        int simple = 0;

        //вывод массива
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
            System.out.print(array[i] + " ");
        }
        System.out.println("массив выведен");

        //1. вывод количества четных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (ArraysMethods.isEvenNum(array[i])) {
                even++;
            }
        }
        System.out.println("1. " + even);

        //2. вывод количества нечетных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (!ArraysMethods.isEvenNum(array[i])) {
                odd++;
            }
        }
        System.out.println("2. " + odd);

        //3. вывод количества простых чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (ArraysMethods.isSimple(array[i])) {
                simple++;
            }
        }
        System.out.println("3. " + simple);

        //4. вывод суммы всех чисел массива
        // ПОДСКАЖИТЕ КАК ВЫНЕСТИ В КЛАСС ArrayMethods И ВЫЗВАТЬ ЕГО СЮДА, ВСЮ ГОЛОВУ СЛОМАЛА
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("4. " + sum);

        //5. вывод разности между суммой четных индексов и суммой нечетных
        // ПОДСКАЖИТЕ КАК ВЫНЕСТИ В КЛАСС ArrayMethods И ВЫЗВАТЬ ЕГО СЮДА, ВСЮ ГОЛОВУ СЛОМАЛА
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += array[i];
            } else {
                oddIndexSum += array[i];
            }
        }
        System.out.println("5. " + (evenIndexSum - oddIndexSum));

        //6. вывод количества нулей в массиве
        for (int i = 0; i < array.length; i++) {
            if (ArraysMethods.isZero(array[i])) {
                zero++;
            }
        }
        System.out.println("6. " + zero);
    }
}

