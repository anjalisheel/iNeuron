public class Program {
    public static void main(String[] args) {
        SingletonExample se1 = SingletonExample.getInstance();
        SingletonExample se2 = SingletonExample.getInstance();
        SingletonExample se3 = SingletonExample.getInstance();
        se1.printMessage("Sample message for a non static method");
        SingletonExample.printStaticMessage("Static message example");
    }
}