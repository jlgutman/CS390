package lesson5.problem1;

public class Clothing extends Product {
    private String brand;
    private double discountValue;

    public Clothing(String productName, double price, String brand, double discountValue) {
        super(productName, price);
        this.brand = brand;
        this.discountValue = discountValue;
    }

    @Override
    public double getPrice(){
        double price = super.getPrice();
        double discount = price * (discountValue / 100);
        return price - discount;
    }

    @Override
    public String toString(){
        return "productName=" + getProductName()
                + ", price=" + getPrice()
                + ", brand=" + brand
                + ", discountValue=" + discountValue;
    }
}
