public class SingletonExample {
    private SingletonExample()
    {
        System.out.println("Private Constructor");
    }

    private static SingletonExample instance = new SingletonExample();

    public static SingletonExample getInstance()
    {
        return instance;
    }

    public void printMessage(String message)
    {
        System.out.println("Message : " + message);
    }
}