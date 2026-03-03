package lesson5.problem1;

public class Furniture extends Product {
    private Material material;
    private double shippingCost;

    public Furniture(String productName, double price, Material material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString(){
        return "productName=" + getProductName()
                + ", price=" + getPrice()
                + ", material=" + material
                + ", shippingCost=" + shippingCost;
    }
}
