import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order("Andriy"));
        orderBoard.add(new Order("Maks"));
        orderBoard.add(new Order("Dmitro"));
        orderBoard.add(new Order("Olena"));

        // Printing the current state of the queue
        orderBoard.draw();

        // Delivering the next order
        Order nextOrder = orderBoard.deliver();
        System.out.println("Next order delivered: " + nextOrder.getCustomerName());

        // Delivering an order with a specific order number
        Order specificOrder = orderBoard.deliver(3);
        System.out.println("Specific order delivered: " + specificOrder.getCustomerName());

        // Printing the updated state of the queue
        orderBoard.draw();
    }
    }
