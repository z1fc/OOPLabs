import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввід тексту
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        // Ввід довжини слова
        System.out.print("Введіть довжину слова: ");
        int length = scanner.nextInt();

        // Опрацювання тексту
        String result = processText(text, length);

        // Виведення результату
        System.out.println("Початковий рядок: " + text);
        System.out.println("Після опрацювання: " + result);
    }

    public static String processText(String text, int length) {
        StringBuilder result = new StringBuilder();

        // Розділення тексту на слова
        String[] words = text.split("\\s+");

        // Перевірка кожного слова
        for (String word : words) {
            // Перевірка довжини та першої літери
            if (!(word.length() == length && isConsonant(word.charAt(0)))) {
                // Слово не відповідає умовам, додаємо до результату
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    // Метод для перевірки чи є літера приголосною
    public static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    }
}
