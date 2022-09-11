public class Order {
    //Mandatory attributes
    private float price;
    private String name;

    //Optional attributes
    private String wrapping;

    public Order(OrderBuilder orderBuilder)
    {
        this.name = orderBuilder.name;
        this.price = orderBuilder.price;
        this.wrapping = orderBuilder.wrapping;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", wrapping='" + wrapping + '\'' +
                '}';
    }

    public static class OrderBuilder implements IOrder {
        //Mandatory attributes
        private float price;
        private String name;

        //Optional attributes
        private String wrapping;

        public OrderBuilder(float price, String name)
        {
            this.name = name;
            this.price = price;
        }

        //for wrapping - optional attribute
        public OrderBuilder setWrapping(String wrapping)
        {
            this.wrapping = wrapping;
            return this;
        }

        @Override
        public Order buildOrder() {
            return new Order(this);
        }
    }
}
