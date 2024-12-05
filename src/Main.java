public class Main {
    public static void main(String[] args) {
        // Создание категорий
        Category electronics = new Category("Электроника", "Устройства и гаджеты");
        Category groceries = new Category("Groceries", "Продукты питания на каждый день");

        // Создание продуктов
        Product phone = new Product("Смартфон", "Смартфон последней модели", 699.99, 50);
        Product laptop = new Product("Ноутбук", "Высокопроизводительный ноутбук", 1299.99, 30);


        // Добавление продуктов в категории
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        // Вывод информации
        System.out.println("Total Categories: " + Category.getTotalCategories());
        System.out.println("Total Unique Products: " + Category.getTotalUniqueProducts());
    }
}