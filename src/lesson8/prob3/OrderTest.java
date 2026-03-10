package lesson8.prob3;

import lesson8.Student;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order("1000", "Tom", 400.50));
        orders.add(new Order("1001", "Anna", 201.00));
        orders.add(new Order("1002", "Jim", 45.50));
        orders.add(new Order("1003", "Tod", 40.00));
        orders.add(new Order("1004", "Joe", 199.50));
        orders.add(new Order("1005", "Anna", 200.00));

        System.out.println(orders);
        //deleting an object
        orders.remove(new Order("1003", "Tod", 700.00));
        System.out.println(orders);
        System.out.println("new size: " + orders.size());
        System.out.println("Retrieve an Order by position: " + orders.get(1));
        System.out.println("Update the details of an Order by position: " + orders.set(1, new Order("1001", "Anna", 202.00)));
        System.out.println(orders);
        System.out.println("Sort by getTotalAmount::::::::: ");
        Collections.sort(orders, Comparator.comparing(Order::getTotalAmount)
                .thenComparing(Order::getCustomerName)
                .thenComparing(Order::getOrderId));
        System.out.println(orders);
        System.out.println("Filtering::::::::: ");
        List<Order> filteredOrders = listMoreThan50(orders);
        System.out.println("Filtered Orders: " + filteredOrders);
        Collections.sort(filteredOrders, new OrderComparator());
        System.out.println("Sorted Orders by Name: " + filteredOrders);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        if (list == null || list.isEmpty()) return new ArrayList<>(){};
        List<Order> result = new ArrayList<>();
        for (Order o : list) {
            if (o != null && o.getTotalAmount() > 50) {
                result.add(o);
            }
        }
        return result;
    }
}
