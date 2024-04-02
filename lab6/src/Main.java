public class Main {
    public static void main(String[] args) {
        // Створення декількох об'єктів класу Medicine
        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine(123, "Ліки 2", "Виробник 2", "Опис 2");
                Medicine medicine3 = new Medicine();
        // Використання методів get() і set()
        medicine1.setName("Ліки 1");
        medicine1.setManufacturer("Виробник 1");
        medicine1.setDescription("Опис 1");
        // Виведення інформації про об'єкти
        System.out.println(medicine1);
        System.out.println(medicine2);
        System.out.println(medicine3);
        // Перевірка конструктора копіювання
        medicine3.setName("Нова назва");
        System.out.println(medicine3);
        System.out.println(medicine2);
    }
}
