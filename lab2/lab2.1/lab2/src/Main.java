import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створити об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитати користувача про текст та довжину слова
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        System.out.println("Введіть довжину слова:");
        int wordLength = scanner.nextInt();

        // Створити об'єкт класу TextProcessor
        TextProcessor processor = new TextProcessor();

        // Вивести початковий рядок
        System.out.println("Початковий рядок:");
        System.out.println(text);

        // Вилучити слова заданої довжини, що починаються на приголосну літеру
        String processedText = processor.processText(text, wordLength);

        // Вивести рядок після опрацювання
        System.out.println("Рядок після опрацювання:");
        System.out.println(processedText);

        // Закрити Scanner
        scanner.close();
    }
}