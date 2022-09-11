public class BatchSubscriber implements IObserverStudent {
    private String name;
    private ISession session;

    public BatchSubscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void update() {
        String sessionPlan = session.getUpdate(this);
        System.out.println("Fetched the session plan of the class");
    }

    @Override
    public void setClass(ISession session) {
        this.session = session;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
