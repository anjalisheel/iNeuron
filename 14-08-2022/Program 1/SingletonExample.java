public class SingletonExample {
    private SingletonExample()
    {
        System.out.println("Private constructor");
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

    public void print(String message)
    {
        System.out.println("Message : " + message);
    }
}
