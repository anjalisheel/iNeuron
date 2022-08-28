public class Program {
    public static void main(String[] args) {
        //multiple instances of Demo class
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();
        obj1.printDemo();
        System.out.println();

        //single instance of SingletonExample class
        SingletonExample se1 = SingletonExample.getInstance();
        SingletonExample se2 = SingletonExample.getInstance();
        SingletonExample se3 = SingletonExample.getInstance();
        se1.printMessage("Sample message for a non static method");
        SingletonExample.printStaticMessage("Static message example");
    }
}