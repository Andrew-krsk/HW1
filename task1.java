import java.util.Arrays;
import java.util.OptionalDouble;


// Task1

// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

public class task1 {
    public static void main(String[] args) {
        int maxRand = 301;
        int size = 10;
        int[] array = new int[size]; 
        array = GenerateRandomArray(maxRand, size);
        System.out.println(Arrays.toString(array));
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Min = " + min);
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Max = " + max);
        OptionalDouble average = Arrays.stream(array).average();
        System.out.println("Average = "+average.getAsDouble());
    }

    private static int[] GenerateRandomArray(Integer maxRand, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxRand));
        }
        return array;
    }

}
