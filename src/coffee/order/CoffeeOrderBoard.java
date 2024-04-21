package coffee.order;

import java.util.LinkedList;
import java.util.List;




public class CoffeeOrderBoard {
    private List<Order> _orders;

    public CoffeeOrderBoard() {
        _orders = new LinkedList<>();
    }
    public void add(Order order) {
        int orderNumber = _orders.size() + 1;
        order.setOrderNumber(orderNumber);
        _orders.add(order);
    }
    public Order deliver() {
        if (_orders.isEmpty())
            return null;

        return _orders.remove(0);
    }

    public Order deliver(int orderNumber) {
        for (Order order : _orders) {
            if (order.getOrderNumber() == orderNumber) {
                _orders.remove(order);
                return order;
            }
        }
        return null; // Order not found
    }
    public void draw() {
        System.out.println("============= \nNum | Name");
        for (Order order : _orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}