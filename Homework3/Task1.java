package Homework3;

import java.util.ArrayList;
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(16);
        numbers.add(7);
        numbers.add(28);
        numbers.add(2);
        System.out.println("Начальный список чисел: " + numbers);
        numbers.removeIf(x -> (x % 2) != 0);;
        System.out.println("Список с удалёнными нечётными: " + numbers);
    }
}
