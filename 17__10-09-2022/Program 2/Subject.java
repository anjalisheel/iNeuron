import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private final List<IObserver> observerList = new ArrayList<>();

    private String productName;
    private String availability;

    public Subject(String productName, String availability) {
        this.availability = availability;
        this.productName = productName;
    }

    public String getAvailability()
    {
        return this.availability;
    }

    public void setAvailability(String availability)
    {
        this.availability = availability;
        System.out.println("Availability changed from out of stock to available");
        notifyObserver();
    }

    @Override
    public void register(IObserver observer) {
        System.out.println("Observer added : " + observer.getName());
        observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        System.out.println("Observer removed");
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Product name : " + productName + " is now available, notifying all registered users");

        for(IObserver observer : observerList)
        {
            observer.update(availability);
        }
    }


}
