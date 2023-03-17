package Homework2;

import java.io.*;
import java.util.Scanner;

// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
public class Task2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку, которую нужно записать в файл: ");
        String text = in.nextLine();  
        System.out.print("Введите количество повторений строки: ");
        int count = in.nextInt();          
        in.close();
        try {
            File f = new File("D:\\JAVA_COURSE\\Homework2\\file.txt");
            if (f.createNewFile()) // создание файла
                System.out.println("Файл успешно создан!");
            else
                System.out.println("Такой файл уже есть в данной папке.");
        } catch (Exception e) {
            System.err.println(e);
        }
        try (FileWriter writer = new FileWriter("D:\\JAVA_COURSE\\Homework2\\file.txt", false)) {
            // запись строки
            writer.write(text.repeat(count));
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}