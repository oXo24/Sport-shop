public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order firstOrder = orderBuilder.prepareFirstOrder();
        System.out.println("Your order:");
        firstOrder.showItems();
        System.out.println("Total Cost: " + firstOrder.getCost());

        Order secondOrder = orderBuilder.prepareSecondOrder();
        System.out.println("\nYour order:");
        secondOrder.showItems();
        System.out.println("Total Cost: " + secondOrder.getCost());
    }
}

