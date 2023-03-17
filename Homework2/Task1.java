package Homework2;
public class Task1 {
    public static void main(String[] args) {
        System.out.println(characterString(9, 'a', 'b'));
    }
    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
    // строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с
    // c1. (6, 'a', 'b') -> "ababab"

    private static String characterString(int n, char c_1, char c_2) {
        String s = "" + c_1 + c_2;
        if (n <= 0) {return "Вы ввели некорректное число. Повторите ввод заново.";}
        if (n % 2 != 0) {return s.repeat(n/2) + c_1;}
        return s.repeat(n/2); // Работает для любого N, а не только для чётного
    }
}