package lesson5.problem1;

public class TestClass {
    void main() {
        Product p1 = new Electronics("Laptop", 1800.0, 12, 200.0);
        Product p2 = new Furniture("Table", 300.0, Material.WOOD, 30.0);
        Product p3 = new Clothing("Jacket", 190.0, "Columbia", 50);
        Product p4 = new Electronics("Camera", 3800.0, 12, 100.0);
        Product p5 = new Furniture("Chair", 50.0, Material.PLASTIC, 10.0);
        Product[] products = {p1, p2, p3, p4, p5, null};

        for (Product p : products){
            if (p != null) {
                System.out.println(p.getClass().getSimpleName() + ": " + p.toString());
            }
        }

        System.out.println("Total price is: " + sumProducts(products));
        System.out.println("Null test of Total price is: " + sumProducts(null));
        System.out.println("Empty test of Total price is: " + sumProducts(new Product[]{}));
    }

    public static double sumProducts(Product[] col) {
        if (col == null || col.length == 0) {
            return 0;
        }
        double sum = 0.0;
        for (Product p : col){
            if (p != null) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
