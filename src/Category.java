import java.util.ArrayList;
import java.util.List;

class Category {
    private String name;
    private String description;
    private List<Product> products;
    private static int totalCategories = 0;
    private static int totalUniqueProducts = 0;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
        totalCategories++;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalUniqueProducts++;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static int getTotalCategories() {
        return totalCategories;
    }

    public static int getTotalUniqueProducts() {
        return totalUniqueProducts;
    }
}