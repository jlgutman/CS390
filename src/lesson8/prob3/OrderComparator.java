package lesson8.prob3;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int result = o1.getCustomerName().compareTo(o2.getCustomerName());
        if(result != 0) {
            return result;
        } else if (Double.compare(o1.getTotalAmount(), o2.getTotalAmount()) != 0) {
            return Double.compare(o1.getTotalAmount(), o2.getTotalAmount());
        } else {
            return o1.getOrderId().compareTo(o2.getOrderId());
        }
    }
}
