package lesson3.problem4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity){
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice(){
        double pricePerSize = switch (pizzaSize) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };
        double pricePerType = switch (pizzaType) {
            case VEGGIE -> 1.0;
            case PEPPERONI, BBQ_CHICKEN -> 2.0;
            case CHEEZE -> 1.5;
        };
        price = (pricePerSize + pricePerType ) * quantity;
    }

    public String printOrderSummary() {
        calculatePrice();
        double tax = price * 0.03;
        double totalPrice = price + tax;
        return String.format("Pizza Order:\n" +
                "Size: %s\n" +
                "Type: %s\n" +
                "Qty: %d\n" +
                "Price: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total Price: $%.2f", pizzaSize, pizzaType, quantity, price, tax, totalPrice);
    }
}
