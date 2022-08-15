import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {
    private static void printFirstMessage()
    {
        SingletonExample obj1 = SingletonExample.getInstance();
        obj1.print("Message from obj 1");
    }

    private static void printSecondMessage()
    {
        SingletonExample obj3 = SingletonExample.getInstance();
        obj3.print("Message from obj 3");
    }

    private static void printThirdMessage()
    {
        SingletonExample obj1 = SingletonExample.getInstance();
        obj1.print("Message from obj 1");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable createFirstObj = () -> printFirstMessage();
        executorService.execute(createFirstObj);

        Runnable createSecondObj = () -> printSecondMessage();
        executorService.execute(createSecondObj);

        //inline
        executorService.execute(() -> printThirdMessage());

        executorService.shutdown();
    }
}