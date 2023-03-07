import java.util.Arrays;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2020)); // true

        System.out.println(Arrays.toString(createArray(7, 1)));

        replacing0With1Array();

        multiplyingLessThan6By2Array();

        diagonalsWith1();
    }

    // проверить, что сумма a и b лежит между 10 и 20
    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b <= 20) && (a + b >= 10)) {
            return true;
        }
        return false;
    }

    // проверить, что х положительное число
    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    // напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }

    // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0)
                return true;
            else
                return false;
        } else {
            return true;
        }
    }

    // должен вернуть массив длины len, каждое значение которого равно initialValue
    private static int[] createArray(int len, int initalValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла
    // и условия заменить 0 на 1, 1 на 0;

    public static void replacing0With1Array() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(2);
        System.out.println("Задача 1. Заменить 0 на 1, 1 на 0");
        System.out.print("Заданный массив:   ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        System.out.print("Изменённый массив: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
    // циклом, и числа меньшие 6 умножить на 2;

    public static void multiplyingLessThan6By2Array() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Задача 2. Числа меньшие 6 умножить на 2");
        System.out.print("Заданный массив:   ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        System.out.print("Изменённый массив: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 3. Создать квадратный двумерный целочисленный массив (количество строк и
    // столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами.

    public static void diagonalsWith1() {
        Random random = new Random();
        int[][] array = new int[5][5];
        System.out.println("Задача 3. Заполнить диагональные элементы единицами");
        System.out.println("Заданный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2, 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j | j == array[i].length - i - 1) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Изменённый массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
