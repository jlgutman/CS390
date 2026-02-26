package lesson3.problem1;

public class Main {
    static void main() {
        Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
        Address add1 = new Address("123 main ave", "Chicago", "IL", "52557");
        c1.setBillingAddress(add1);
        c1.setShippingAddress(add1);

        Customer c2 = new Customer("Jose", "Gutierrez", "332-221-4443");
        Address add2 = new Address("1000 N 4th St #MR 19", "Fairfield", "IA", "52557");
        c2.setBillingAddress(add2);
        c2.setShippingAddress(add2);

        Customer c3 = new Customer("Joao", "Smith", "332-221-4442");
        c3.setBillingAddress(new Address("1000 N 4th St #MR 9", "Fairfield", "IA", "52557"));
        c3.setShippingAddress(new Address("1000 N 4th St #MR 345", "Fairfield", "IA", "52557"));

        Customer[] customers = {c1, c2, c3};
        for (Customer c : customers){
            if(c.getBillingAddress().getCity().equals("Chicago")){
                IO.println(c.toString());
            }
        }
    }
}
