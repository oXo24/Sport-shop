public class OrderBuilder {

    public Order prepareFirstOrder() {
        Order order = new Order();
        order.addItem(new WhiteCap());
        order.addItem(new RedShirt());
        return order;
    }

    public Order prepareSecondOrder() {
        Order order = new Order();
        order.addItem(new BlackCap());
        order.addItem(new BlueShirt());
        return order;
    }
}
