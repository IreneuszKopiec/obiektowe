package z9;

import java.time.LocalDate;
import java.util.Comparator;

public class Order implements Comparator<Order> {
    public int id;
    public String customerName;
    public LocalDate orderDate;

    public Order(int id, LocalDate orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", orderDate=" + orderDate;
    }

    @Override
    public int compare(Order o1, Order o2) {
        return 0;
    }
}


