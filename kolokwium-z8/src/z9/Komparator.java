package z9;

import java.util.Comparator;

public class Komparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if((o1.orderDate.compareTo(o2.orderDate))==0) {
            return Integer.compare(o1.id,o2.id);
        }
        return o1.orderDate.compareTo(o2.orderDate);
    }
}
