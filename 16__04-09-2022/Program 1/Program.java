public class Program {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder(1000f, "Plant").buildOrder();
        System.out.println(order1);

        Order order2 = new Order.OrderBuilder(1500f, "Painting").
                setWrapping("Gift wrap costs Rs 30.").buildOrder();
        System.out.println(order2);
    }
}