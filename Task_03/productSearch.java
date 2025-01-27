public class ProductSearch {
    public static class Product {
        String productName;
        String category;
        double price;
        String brandName;
        public Product(String productName, String category, double price, String brandName) {
            this.productName = productName;
            this.category = category;
            this.price = price;
            this.brandName = brandName;
        }
    }
static Product[] products = new Product[20];
public static void filterProducts(String category) {
        for (Product p : products) {
            if (p!=null && p.category.equalsIgnoreCase(category)) {
                System.out.println(p.productName+" "+p.brandName);
            }
        }
    }
public static void filterProducts(double minPrice, double maxPrice) {
        for (Product p : products) {
            if (p != null && p.price >= minPrice && p.price <= maxPrice) {
                System.out.println(p.productName+" "+p.brandName);
            }
        }
    }
public static void filterProducts(String name,String brand) {
        for (Product p : products) {
            if (p != null && p.brandName.equalsIgnoreCase(brand)) {
                System.out.println(p.productName+" "+p.brandName);            }
        }
    }
public static void filterProducts(String category, double minPrice, double maxPrice) {
        for (Product p : products) {
            if (p != null && p.category.equalsIgnoreCase(category) && p.price >= minPrice && p.price <= maxPrice) {
                    System.out.println(p.productName+" "+p.brandName);            }
        }
    }
public static void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        for (Product p : products) {
            if (p != null && p.category.equalsIgnoreCase(category) && p.price >= minPrice && p.price <= maxPrice &&
                p.brandName.equalsIgnoreCase(brand)) {
                     System.out.println(p.productName+" "+p.brandName);            }
        }
    }
 public static void main(String[] args) {
        products[0] = new Product("i-phone", "Electronics",500, "Apple");
        products[1] =  new Product("Monitor", "Electronics",100, "hp");
        products[2] = new Product("Mouse", "Electronics", 20, "Dell");
        products[3] = new Product("Scanner", "Electronics",110, "Cannon");
        products[4] = new Product("Refrigerator", "Electronics",200, "LG");
        products[5] = new Product("T-Shirt", "Fashion", 40, "Puma");
        products[6] = new Product("Shose", "Fashion", 100, "Nike");
        products[7] = new Product("Shose", "Fashion", 200, "Adidas");
        products[8] = new Product("Bag", "Fashion", 150, "Gucci");
        products[9] = new Product("Jeans", "Fashion", 80, "Levi's");
        products[10] = new Product("Bike", "Vehicle", 300, "Hero");
        products[11] = new Product("Car", "Vehicle", 10000, "Tesla");
        products[12] = new Product("Car", "Vehicle", 13000, "Toyota");
        products[13] = new Product("Bike", "Vehicle", 250, "TVS");
        products[14] = new Product("Cycle", "Vehicle", 100, "Phonix");
        products[15] = new Product("Antivirus", "Software", 40, "AVG");
        products[16] = new Product("Antivirus", "Software", 50, "Norton");
        products[17] = new Product("Windows 11", "Software", 60, "Microsoft");
        products[18] = new Product("Microsoft Surface", "Software", 12, "Microsoft");
        products[19] = new Product("Pycharm", "Software", 15, "JtBrain");
        filterProducts(100.0,600.8);
        filterProducts("Data","Microsoft");
        filterProducts("Vehicle");
        filterProducts("Fashion",10.0,300.0);

    }
}
