public class Program {
    public static void main(String[] args) {
        SingletonExample se = SingletonExample.getInstance();
        se.printMessage("Hello world");
    }
}