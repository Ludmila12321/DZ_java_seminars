package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
// ["string", "s", "my_value"]

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> withoutNumbers = new ArrayList<>();
        withoutNumbers.add("string");
        withoutNumbers.add("s");
        withoutNumbers.add("5");
        withoutNumbers.add("10");
        withoutNumbers.add("-12");
        withoutNumbers.add("my_value");
        Iterator<String> iterator = withoutNumbers.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (isNumeric(element)) {
                iterator.remove();
            }
        }

        System.out.println(withoutNumbers);
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}