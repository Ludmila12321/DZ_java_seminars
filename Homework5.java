import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
 * проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
public class Homework5 {
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        System.out.println(text);
        collectStats(text);

    }

    static void collectStats(String text) {
        // Разбиваем текст на слова
        String[] words = text.split(" ");
        // Создаем HashMap для хранения слов и их длин
        Map<String, Integer> wordLengths = new HashMap<>();

        // Заполняем массив
        for (String word : words) {
            wordLengths.put(word, word.length());
        }

        // Сортируем слова по длине
        String[] sortedWords = wordLengths.keySet().toArray(new String[0]);
        Arrays.sort(sortedWords, (a, b) -> wordLengths.get(a) - wordLengths.get(b));

        // Выводим отсортированные слова
        for (int i = 0; i < sortedWords.length; i++) {

            if ((i >= 1) && (sortedWords[i - 1].length() != sortedWords[i].length())) {
                System.out.println();
                System.out.print(sortedWords[i] + ' ');
            } else {
                System.out.print(sortedWords[i] + ' ');
            }
        }

    }
}