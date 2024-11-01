package ru.dyankovskaya.arrays._main;

import ru.dyankovskaya.arrays.service.ArraysMethods;

import java.util.Random;

public class _Main {
    public static void main(String[] args) {

        //вывод массива
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("массив выведен");

        //1. вывод количества четных чисел в массиве
        System.out.println("1. " + ArraysMethods.evenCounter(array));

        //2. вывод количества нечетных чисел в массиве
        System.out.println("2. " + ArraysMethods.oddCounter(array));

        //3. вывод количества простых чисел в массиве
        System.out.println("3. " + ArraysMethods.primeCounter(array));

        //4. вывод суммы всех чисел массива
        System.out.println("4. " + ArraysMethods.sum(array));

        //5. вывод разности между суммой четных индексов и суммой нечетных индексов
        System.out.println("5. " + ArraysMethods.diff(array));

        //6. вывод количества нулей в массиве
        System.out.println("6. " + ArraysMethods.zeroCounter(array));
    }
}