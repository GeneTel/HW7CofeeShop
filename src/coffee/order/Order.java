package coffee.order;

public class Order {
    private int _orderNumber;
    private String _customerName;

    public Order(String customerName) {
        _customerName = customerName;
    }

    public int getOrderNumber() {
        return _orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this._orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return _customerName;
    }

}