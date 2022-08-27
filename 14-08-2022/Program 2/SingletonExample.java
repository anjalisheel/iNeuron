public class SingletonExample {
    private SingletonExample()
    {
        System.out.println("Private constructor");
    }

    private static volatile SingletonExample instance;
    private static Object object = new Object();

    public static SingletonExample getInstance()
    {
        SingletonExample singletonExample = instance;
        if(singletonExample == null)
        {
            synchronized (object)
            {
                singletonExample = instance;
                if(singletonExample == null)
                {
                    instance = singletonExample = new SingletonExample();
                }
            }
        }

        return singletonExample;
    }

    public void print(String message)
    {
        System.out.println("Message : " + message);
    }
}
