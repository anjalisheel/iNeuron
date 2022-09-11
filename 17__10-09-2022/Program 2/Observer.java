public class Observer implements IObserver {
    private String userName;

    public Observer(String userName, ISubject subject) {
        this.userName = userName;
        subject.register(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + userName + ". Product is now " + availability);
    }

    @Override
    public String getName() {
        return this.userName;
    }
}
