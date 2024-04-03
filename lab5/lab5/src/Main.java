import java.util.Scanner;

public class Main {
    private static final int PRODUCTS_COUNT = 5;
    private static Product[] products = new Product[PRODUCTS_COUNT];

    public static void main(String[] args) {
        fillProducts();
        System.out.println("Всі продукти:");
        printProducts(products);
        System.out.println("\nПродукти з найменуванням \"Молоко\":");
        printProductsByName("Молоко");
        System.out.println("\nПродукти з ціною, що не перевищує 20 грн.:");
        printProductsByPrice();
        System.out.println("\nПродукти, термін зберігання яких більше 30 днів:");
        printProductsByShelfLife();
    }

    private static void fillProducts() {
        products[0] = new Product(1, "Молоко", "Агропродукт", 15.5, 30, 10);
        products[1] = new Product(2, "Хліб", "Київхліб", 12.0, 7, 20);
        products[2] = new Product(3, "Сир", "Галактон", 25.0, 60, 5);
        products[3] = new Product(4, "Яйця", "Ясенсвіт", 30.0, 25, 15);
        products[4] = new Product(5, "Сметана", "Здорово", 20.0, 45, 8);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void printProductsByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    private static void printProductsByPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть максимальну ціну для фільтрації: ");
        double maxPrice = scanner.nextDouble();
        for (Product product : products) {
            if (product.getPrice() != null && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    private static void printProductsByShelfLife() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальний термін зберігання для фільтрації: ");
        int minShelfLife = scanner.nextInt();
        for (Product product : products) {
            if (product.getShelfLife() != null && product.getShelfLife() > minShelfLife) {
                System.out.println(product);
            }
        }
    }
}
