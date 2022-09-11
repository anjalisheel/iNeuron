public interface ISession {
    //Method to allow student registration
    public void register(IObserverStudent student);

    //Method to unregister the class
    public void unregister(IObserverStudent student);

    //Notify all the students about the class
    public void notifyStudents();

    //Student can call and ask about the class
    public String getUpdate(IObserverStudent student);
}
