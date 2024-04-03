public class TextProcessor {
    public String processText(String text, int wordLength) {
        // Розділити текст на слова
        String[] words = text.split("\\s+");

        // Створити об'єкт StringBuilder для зберігання опрацьованого тексту
        StringBuilder processedText = new StringBuilder();

        // Пройтись по кожному слову
        for (String word : words) {
            // Перевірити, чи має слово вказану довжину та починається на приголосну літеру
            if (word.length() == wordLength && startsWithConsonant(word)) {
                // Додати слово до опрацьованого тексту
                processedText.append(word).append(" ");
            }
        }

        // Повернути опрацьований текст у вигляді рядка
        return processedText.toString().trim();
    }

    private boolean startsWithConsonant(String word) {
        // Перевірити, чи починається слово на приголосну літеру
        char firstLetter = Character.toLowerCase(word.charAt(0));
        return (firstLetter >= 'a' && firstLetter <= 'z' && !("aeiouаеіоуиюя".contains(String.valueOf(firstLetter))));
    }
}