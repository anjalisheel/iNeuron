public class SingletonExample {
    private SingletonExample()
    {
        System.out.println("Private Constructor");
    }

    private static SingletonExample instance = null;

    public static SingletonExample getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonExample();
        }

        return instance;
    }

    public void printMessage(String message)
    {
        System.out.println("Message : " + message);
    }

    public static void printStaticMessage(String message)
    {
        System.out.println("Static Message : " + message);
    }
}