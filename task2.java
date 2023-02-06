// Task2
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int maxRand = 301;
        int size = 10;
        int[] array = new int[size];
        array = GenerateRandomArray(maxRand, size);
        System.out.println(Arrays.toString(array));
        BobleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] GenerateRandomArray(Integer maxRand, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxRand));
        }
        return array;
    }

    private static int[] BobleSort(int[] array) {
        int tempVar;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tempVar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        return array;
    }
}
