public class Program {
    public static void main(String[] args) {
        //this will consist of phone specifications
        Product product = new Product("Phone", 10000);

        //Provide strategy to the client for making payment
        AmazonCart amazonCart = new AmazonCart(product, new GooglePay());
        amazonCart.pay();
    }
}