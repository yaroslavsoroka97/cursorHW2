package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1. Заповнити масив тільки парними числами
        int[] numbers = new int[10];
        for (int i = 0, a = 2; i < numbers.length; i++) {
            numbers[i] = a;
            a += 2;
        }
        System.out.println("Even numbers " + Arrays.toString(numbers));

        // 2. Заповнити масив рандомними числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Random numbers " + Arrays.toString(array));

        // 3. Вивести середнє значення масиву
        int value = 0;
        for (int i = 0, a; i < array.length; i++) {
            a = array[i];
            value += a;
        }
        System.out.println("Value = " + value / array.length);

        // 4. Вивести суму всіх значень кратних 3
        int summm = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                summm += i;
            }
        }
        System.out.println(summm);

        // 5. Вивести значення всіх парних індексів масиву
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The value of the even index" + i + "is: " + numbers[i]);
            }
        }

        // 6. Просортувати масив в порядку зростання
        int[] arr6 = {21, 54, 38, 98, 11, 63};
        for (int i = 0; i < arr6.length; i++) {
            int min = arr6[i];
            int minId = i;
            for (int j = i + 1; j < arr6.length; j++) {
                if (arr6[j] < min) {
                    min = arr6[j];
                    minId = j;
                }
            }

            int temp = arr6[i];
            arr6[i] = min;
            arr6[minId] = temp;
        }
        System.out.println(Arrays.toString(arr6));

        // 7. Вивести найменше значення в масиві
        int[] arr = {4, 2, 0, 9, -4, 6, 1};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min number " + min);

        // 8. Вивести найбільше значення масиву
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max number " + max);

        // 9. Вивести суму значень всіх парних індексів
        int[] arr9 = new int[10];
        int sum = 0;
        for (int i = 0; i < arr9.length; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        // 10. Вивести перших 20 символів з таблиці ASCI

        char[] symbolsTable = new char[20];
        for (int i = 0; i < symbolsTable.length; i++) {
            symbolsTable[i] = (char) (i + 33);
            System.out.println(symbolsTable[i]);
        }
    }
}
